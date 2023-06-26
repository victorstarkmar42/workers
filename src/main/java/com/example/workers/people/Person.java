package com.example.workers.people;

import com.example.workers.service.JobService;

public class Person {

	private final String name;
	private JobService job;
	private final String curp;
	
	public Person(String name, JobService job, String curp) {
		super();
		this.name = name;
		this.job = job;
		this.curp = curp;
	}

	public JobService getJob() {
		return job;
	}

	public void setJob(JobService job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getCurp() {
		return curp;
	}
	
	
}
