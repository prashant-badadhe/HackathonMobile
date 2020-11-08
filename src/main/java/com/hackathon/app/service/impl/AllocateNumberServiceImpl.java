package com.hackathon.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.app.service.AllocateNumberService;
import com.hackathon.app.service.repo.ApplicationRepository;

@Service
public class AllocateNumberServiceImpl implements AllocateNumberService{
	
	@Autowired
	public ApplicationRepository applicationRepo;

	@Override
	public int allocateMobileNumber(long applicationId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
