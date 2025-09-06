package com.app.domain;

import java.util.Objects;

import com.app.domain.status.ReplyStatus;

public class ReplyVO {
	private Long id;
	private String replyContent;
	private Long memberId;
	private Long postId;
	private ReplyStatus replyStatus;
	private String createdDate;
	private String updatedDate;

	public ReplyVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public ReplyStatus getReplyStatus() {
		return replyStatus;
	}

	public void setReplyStatus(ReplyStatus replyStatus) {
		this.replyStatus = replyStatus;
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
		ReplyVO other = (ReplyVO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", replyContent=" + replyContent + ", memberId=" + memberId + ", postId=" + postId
				+ ", replyStatus=" + replyStatus + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}
}
