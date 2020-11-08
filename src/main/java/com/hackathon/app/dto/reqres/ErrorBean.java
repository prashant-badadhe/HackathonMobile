package com.hackathon.app.dto.reqres;

public class ErrorBean {

	public String errorCode;
	public String description;

	public String getDescription() {
		return description;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
