package com.hackathon.app.service;

import org.springframework.stereotype.Service;

import com.hackathon.app.dto.reqres.AllocateNumberReqBean;
import com.hackathon.app.dto.reqres.ResponseBean;

@Service
public interface AllocateNumberService {
	
	public  ResponseBean allocateMobileNumber(AllocateNumberReqBean allocateBean);

}
