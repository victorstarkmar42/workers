package com.example.workers.service;

public abstract class MilitaryService implements JobService{
	protected final String range;
	
	public MilitaryService(String range) {
		this.range = range;
	}
	
	public String getRange() {
		return range;
	}
}
