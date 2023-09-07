package com.example.workers.service.impl;

import org.springframework.stereotype.Service;

import com.example.workers.service.InsuranceService;
import com.example.workers.service.JobService;

@Service

public class EngineerServiceImpl implements JobService {

	private InsuranceService insuranceService;
	public EngineerServiceImpl(InsuranceService insuranceService) {
		this.insuranceService = insuranceService;
	}
	
	@Override
	public String work() {
		if(insuranceService.isCovered())
			return "Engineer";
		else
		return null;
	}

}
