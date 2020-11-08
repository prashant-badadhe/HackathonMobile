package com.hackathon.app.dto.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBean {

	@JsonProperty("status")
	public String status;

	@JsonProperty("message")
	public String message;

	@JsonProperty("error")
	public ErrorBean errorBean;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorBean getErrorBean() {
		return errorBean;
	}

	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}

}
