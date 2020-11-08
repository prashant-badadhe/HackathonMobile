package com.hackathon.app.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.app.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{

	Application findByApplicationId(String applicationId);
}
