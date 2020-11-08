package com.hackathon.app.dto.reqres;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllocateNumberReqBean {

	@JsonProperty("applicationId")
	@NotNull
	String applicationId;

	@NotNull
	@JsonProperty("mobileNumber")
	long mobileNumber;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
