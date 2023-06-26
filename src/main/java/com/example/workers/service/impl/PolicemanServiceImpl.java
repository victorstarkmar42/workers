package com.example.workers.service.impl;

import org.springframework.stereotype.Service;

import com.example.workers.service.JobService;

@Service

public class PolicemanServiceImpl implements JobService {

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "Policeman";
	}

}
