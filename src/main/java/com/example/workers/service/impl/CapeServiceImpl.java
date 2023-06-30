package com.example.workers.service.impl;

import org.springframework.stereotype.Service;

import com.example.workers.service.MilitaryService;

@Service
public class CapeServiceImpl extends MilitaryService {
	
	private static final String CAPE = "CAPE";

	public CapeServiceImpl() {
		super(CAPE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return this.range;
	}

}
