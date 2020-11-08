package com.hackathon.app.service;

import org.springframework.stereotype.Service;

@Service
public interface AllocateNumberService {
	
	int allocateMobileNumber(long applicationId);  

}
