package com.app.domain.status;

public enum PostStatus {
	ENABLE("enable"), DLSABLE("disable");
	
	private String value;

	private PostStatus(String value) {
		this.value = value;
	}

	protected String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
