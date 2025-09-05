package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.member.MemberGender;

public class MemberDAO {
//	내가 설정한 RDB의 연결 객체
	private Connection connection;
//	내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private PreparedStatement preparedStatement;
//	조회 결과를 담아줄 객체
	private ResultSet resultSet;
	
//	추가
	public void insert(MemberVO memberVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		
		stringBuilder.append("insert into tbl_member ");
		stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberGender().getValue());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert(MemberVO) SQL 오류");
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
	
//	수정
	public void update(MemberVO memberVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("update tbl_member ");
		stringBuilder.append("set member_password=?, member_name=?, member_age=?, member_gender=?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setInt(3, memberVO.getMemberAge());
			preparedStatement.setString(4, memberVO.getMemberGender().getValue());
			preparedStatement.setLong(5, memberVO.getId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update(MemberVO) SQL문 오류");
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

//	삭제
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update tbl_member ");
		stringBuilder.append("set member_status = disable ");
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
	
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("delete from tbl_member ");
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
		public Optional<MemberVO> selectOne(Long id) {
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement =  connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				MemberGender memberGender = null;
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));
			}
			
		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
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
		return Optional.ofNullable(memberVO);
	}
	
//	전체 조회
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member");
		
		query = stringBuilder.toString();
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement =  connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				MemberGender memberGender = null;
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));
				
				members.add(memberVO);
			}
			
		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
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
		return members;
	}
}

