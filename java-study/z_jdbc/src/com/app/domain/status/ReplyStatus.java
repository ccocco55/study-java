package com.app.domain.status;

public enum ReplyStatus {
	ENABLE("enable"), DLSABLE("disable");
	
	private String value;

	private ReplyStatus(String value) {
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
