package com.hackathon.app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.app.dto.reqres.AllocateNumberReqBean;
import com.hackathon.app.dto.reqres.ResponseBean;
import com.hackathon.app.service.AllocateNumberService;

@RestController
@RequestMapping("${app.hackathon.basepath}")
public class AllocateNumberResource {
	 
	
	@Autowired
	public AllocateNumberService allocateNumberService;

	@PostMapping("${app.hackathon.allocate.number.POST}")
	public ResponseEntity<Object> createStudent(@RequestBody AllocateNumberReqBean allocateNumBean) {

		System.out.println("allocateNumBean: "+allocateNumBean.getApplicationId());
		System.out.println("allocateNumBean: "+allocateNumBean.getMobileNumber());
		
		ResponseBean response = new ResponseBean();
		response.setStatus("SUCCESS");
		response.setMessage("Allocated number successfully.");
		return ResponseEntity.ok(response);

	}
}
