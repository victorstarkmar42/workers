package com.example.workers.service.impl;

import org.springframework.stereotype.Service;

import com.example.workers.service.MilitaryService;

@Service
public class SatintServiceImpl extends MilitaryService{
	
	private static final String SATIN = "SATIN";
	
	public SatintServiceImpl() {
		super(SATIN);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return this.range;
	}
	

}
