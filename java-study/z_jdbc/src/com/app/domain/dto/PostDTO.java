package com.app.domain.dto;

import java.util.Objects;

import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.member.MemberGender;
import com.app.domain.status.MemberStatus;
import com.app.domain.status.PostStatus;

public class PostDTO {
	private Long id;
	private String postTitle;
	private String postContent;
	private int postReadCnt;
	private String memberName;
	private String createdDate;
	private String updatedDate;

	public PostDTO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public int getPostReadCount() {
		return postReadCnt;
	}

	public void setPostReadCount(int postReadCnt) {
		this.postReadCnt = postReadCnt;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostDTO other = (PostDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postReadCnt="
				+ postReadCnt + ", memberName=" + memberName + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}
	
	public PostVO toVO() {
		PostVO postVO = new PostVO();
		postVO.setId(id);
		postVO.setPostTitle(postTitle);
		postVO.setPostContent(postContent);
		postVO.setPostReadCount(postReadCnt);
		postVO.setCreatedDate(createdDate);
		postVO.setUpdatedDate(updatedDate);
		
		return postVO; 
	}
	
}
