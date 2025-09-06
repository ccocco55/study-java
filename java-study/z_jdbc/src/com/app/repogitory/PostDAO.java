package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.dto.PostDTO;

public class PostDAO {
//	내가 설정한 RDB의 연결 객체
	private Connection connection;
//	내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private PreparedStatement preparedStatement;
//	조회 결과를 담아줄 객체
	private ResultSet resultSet;

//	추가
	public void insert(PostVO postVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_post ");	// 추가 SQL문
		stringBuilder.append("(post_title, post_content, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();	// 쿼리에 문자열들 담기

		try {
			connection = DBConnecter.getConnection();	// 커넥션에 디비 연결 담기
			preparedStatement = connection.prepareStatement(query);		// SQL 실행 준비하기

			preparedStatement.setString(1, postVO.getPostTitle());	//?에 들어갈 값 넣기
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getMemberId());

			preparedStatement.executeUpdate();	//SQL문에 insert 추가하기
			
//			SQL 실행에서 나는 오류 잡기

		} catch (SQLException e) {
			System.out.println("insert(PostVO) SQL 오류");
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();	// 닫아주기(데이터 누수)
				}
				if (connection != null) {
					connection.close();		// 닫아주기(데이터 누수)
				}

			} catch (SQLException e) {
				throw new RuntimeException();	// 닫기 실패하면 강제 종료
			}
		}
	}

//	수정
	public void update(PostVO postVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_post ");	// 업데이트 SQL문
		stringBuilder.append("set post_title = ?, post_content = ?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();	// DB 연결해 주기
			preparedStatement = connection.prepareStatement(query);	// SQL 실행 준비

			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getId());

			preparedStatement.executeUpdate();	// SQL문에 update 추가하기

		} catch (SQLException e) {
			System.out.println("update(PostVO) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();	// 닫는데 문제 생기면 강제종료
			}
		}
	}

//	삭제(soft-delete)
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_post ");	// 데이터 아예 삭제하지 않고 게시물 상태만 변경
		stringBuilder.append("set post_status = 'disable' ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
	}
	
//	삭제(hard-delete)
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("delete from tbl_post ");	// 데이터 아예 삭제
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("delete(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
	}

//	조회
	public PostDTO selectOne(Long id) {
		PostDTO postDTO = null;	//  멤버 테이블과 게시물 테이블 조인 클래스
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");	// 조회 SQL문
		stringBuilder.append("p.id, p.post_title, p.post_content, p.post_read_count, m.member_name, p.created_date, p.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_post p ");	// 멤버 테이블과 게시물 테이블 조인
		stringBuilder.append("on m.id = p.member_id and p.id = ? and p.post_status = 'enable'");	// 게시물 상태 삭제 안된 것만 조회

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				postDTO = new PostDTO();
				
				// postDTO에 값 담아주기
				postDTO.setId(resultSet.getLong("id"));
				postDTO.setPostTitle(resultSet.getString("post_title"));
				postDTO.setPostContent(resultSet.getString("post_content"));
				postDTO.setPostReadCount(resultSet.getInt("post_read_count"));
				postDTO.setMemberName(resultSet.getString("member_name"));
				postDTO.setCreatedDate(resultSet.getString("created_date"));
				postDTO.setUpdatedDate(resultSet.getString("updated_date"));
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

		return postDTO;
	}
	
//	전체 조회
	public ArrayList<PostDTO> selectAll() {	// 어레이 리스트에 조회한 값들 넣어주기(어려개)
		ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
		PostDTO postDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("p.id, p.post_title, p.post_content, p.post_read_count, m.member_name, p.created_data, p.updated_data ");
		stringBuilder.append("from tbl_member m join tbl_post p ");	// 멤버 테이블과 게시물 테이블 조인
		stringBuilder.append("on m.id = p.member_id and p.post_status = 'enable'");	// 전체 조회니까 id 검사 안함

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				postDTO = new PostDTO();

				postDTO.setId(resultSet.getLong("id"));
				postDTO.setPostTitle(resultSet.getString("post_title"));
				postDTO.setPostContent(resultSet.getString("post_content"));
				postDTO.setPostReadCount(resultSet.getInt("post_read_count"));
				postDTO.setMemberName(resultSet.getString("member_name"));
				postDTO.setCreatedDate(resultSet.getString("created_data"));
				postDTO.setUpdatedDate(resultSet.getString("updated_data"));
				
				posts.add(postDTO);
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

		return posts;
	}
}
























