package com.hackathon.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.app.dto.reqres.AllocateNumberReqBean;
import com.hackathon.app.dto.reqres.ErrorBean;
import com.hackathon.app.dto.reqres.ResponseBean;
import com.hackathon.app.entity.Application;
import com.hackathon.app.service.AllocateNumberService;
import com.hackathon.app.service.repo.ApplicationRepository;

@Service
public class AllocateNumberServiceImpl implements AllocateNumberService{
	
	@Autowired
	public ApplicationRepository applicationRepo;

	@Override
	public ResponseBean allocateMobileNumber(AllocateNumberReqBean allocateBean) {

		//Validate application
		//Get application by ID or number  
		ResponseBean response = new ResponseBean();
		
		Application app=applicationRepo.findByApplicationId(allocateBean.getApplicationId());
		
		if(null==app) {
		response.setMessage("Failed to allocate mobile number");
		response.setStatus("ERROR");
		ErrorBean errBean= new ErrorBean();
		errBean.setErrorCode("ERR-BUS-ALLOCATE-101");
		errBean.setDescription("Application not found");
		response.setErrorBean(errBean);
		return response;
		}
		
		//Valildate Mobile Number
		
		if(isMobileNumberAvailable(allocateBean.getMobileNumber())) {
			//Allocate mobile number
			response.setStatus("SUCCESS");
			response.setMessage("Allocated number successfully.");		
			
		}else {
			response.setMessage("Failed to allocate mobile number");
			response.setStatus("ERROR");
			ErrorBean errBean= new ErrorBean();
			errBean.setErrorCode("ERR-BUS-ALLOCATE-102");
			errBean.setDescription("Mobile number already allocated");
			response.setErrorBean(errBean);
			
		}
		
		
		return response;
	}
	
	private boolean isMobileNumberAvailable(long mobileNumber) {
		
		//TODO Check requested mobile number is avalible to allocate or not
		
		return true;
	}


}
