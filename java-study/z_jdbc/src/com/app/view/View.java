package com.app.view;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.ReplyVO;
import com.app.repogitory.MemberDAO;
import com.app.repogitory.PostDAO;
import com.app.repogitory.ReplyDAO;

public class View {
	public static void main(String[] args) {
		DBConnecter.getConnection();
		
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		PostVO postVO = new PostVO();
		PostDAO postDAO = new PostDAO();
		ReplyVO replyVO = new ReplyVO();
		ReplyDAO replyDAO = new ReplyDAO();
		
//		memberVO.setMemberEmail("test12345@naver.com");
//		memberVO.setMemberPassword("123123");
//		memberVO.setMemberName("test2");
//		memberVO.setMemberAge(32);
//		memberVO.setMemberGender("남");
//		memberVO.setId(1L);
		
//		memberDAO.update(memberVO);
//		memberDAO.insert(memberVO);
		
//		postVO.setPostTitle("테스트 제목2");
//		postVO.setPostContent("테스트 내용2");
//		postVO.setPostReadCount(0);
//		postVO.setMemberId(4L);
//		postVO.setId(1L);
//		
//		postDAO.insert(postVO);
//		postDAO.deleteHard(5L);
//		postDAO.update(postVO);
		
//		postDAO.deleteSoft(1L);
		
//		replyVO.setReplyContent("테스트 댓글");
//		replyVO.setMemberId(4L);
//		replyVO.setPostId(1L);
//		
//		replyDAO.insert(replyVO);
		System.out.println(postDAO.selectAll());
		
		
	}
}
