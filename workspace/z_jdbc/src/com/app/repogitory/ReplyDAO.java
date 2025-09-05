package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.ReplyVO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.member.MemberGender;

public class ReplyDAO {
//	내가 설정한 RDB의 연결 객체
	private Connection connection;
//	내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private PreparedStatement preparedStatement;
//	조회 결과를 담아줄 객체
	private ResultSet resultSet;

//	추가
	public void insert(ReplyVO replyVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_reply "); // 추가 SQL문
		stringBuilder.append("(reply_content, post_id, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();	// 쿼리에 문자열들 담기

		try {
			connection = DBConnecter.getConnection();	// 커넥션에 디비 연결 담기
			preparedStatement = connection.prepareStatement(query);	// SQL 실행 준비하기
			
			//?에 들어갈 값 넣기
			preparedStatement.setString(1, replyVO.getReplyContent());	
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());

			preparedStatement.executeUpdate();	//SQL문에 insert 추가하기
			
//			SQL 실행에서 나는 오류 잡기
		} catch (SQLException e) {
			System.out.println("insert(ReplyVO) SQL 오류");
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();	// 닫아주기(데이터 누수)
				}
				if (connection != null) {
					connection.close();	// 닫아주기(데이터 누수)
				}

			} catch (SQLException e) {
				throw new RuntimeException();	// 닫기 실패하면 강제 종료(데이터 누수 방지!!)
			}
		}
	}

//	수정
	
	public void update(ReplyVO replyVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("update tbl_reply ");	// 업데이트 SQL문
		stringBuilder.append("set reply_content=?, updated_date=current_timestamp(), post_id=0, member_id=0");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();	// DB 연결해 주기
			preparedStatement = connection.prepareStatement(query);	// SQL 실행 준비
			
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());

			
			preparedStatement.executeUpdate();	// SQL문에 update 추가하기
			
		} catch (SQLException e) {
			System.out.println("update(ReplyVO) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();	// 닫는데 문제 생기면 강제종료
			}
		}
	}
//	삭제
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update tbl_reply ");	// 데이터 아예 삭제하지 않고 게시물 상태만 변경
		stringBuilder.append("set reply_status = disable ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("deleteSoft(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("delete from tbl_reply ");	// 데이터 아예 삭제
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
				
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	조회
	public ReplyDTO selectOne(Long id) {
		ReplyDTO replyDTO = null;	//  멤버 테이블과 댓글 테이블 조인 클래스
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("r.id, r.reply_content, m.member_name, r.created_date, r.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_reply r ");	// 멤버 테이블과 댓글 테이블 조인
		stringBuilder.append("on m.id = r.member_id and r.id = ? and r.reply_status = 'enable'");	// 댓글 상태 삭제 안된 것만 조회

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				replyDTO = new ReplyDTO();

				replyDTO.setId(resultSet.getLong("id"));
				replyDTO.setReplyContent (resultSet.getString("reply_content"));
				replyDTO.setMemberName(resultSet.getString("member_name"));
				replyDTO.setCreatedDate(resultSet.getString("created_date"));
				replyDTO.setUpdatedDate(resultSet.getString("updated_date"));
			}

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return replyDTO;
	}
//	전체 조회
	public ArrayList<ReplyDTO> selectAll() {
		ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
		ReplyDTO replyDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("r.id, r.reply_content, m.member_name, r.created_date, r.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_reply r ");	// 멤버 테이블과 게시물 테이블 조인
		stringBuilder.append("on m.id = r.member_id and r.reply_status = 'enable'");	// 전체 조회니까 id 검사 안함

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				replyDTO = new ReplyDTO();

				replyDTO.setId(resultSet.getLong("id"));
				replyDTO.setReplyContent(resultSet.getString("reply_content"));
				replyDTO.setMemberName(resultSet.getString("member_name"));
				replyDTO.setCreatedDate(resultSet.getString("created_date"));
				replyDTO.setUpdatedDate(resultSet.getString("updated_date"));
				
				replies.add(replyDTO);
			}

		} catch (SQLException e) {
			System.out.println("selectAll() SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return replies;
	}
}
