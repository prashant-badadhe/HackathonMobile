package com.hackathon.app.dto.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorBean {

	@JsonProperty("errorCode")
	public String errorCode;
	
	@JsonProperty("description")
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
