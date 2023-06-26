package com.example.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.workers.people.Person;
import com.example.workers.service.JobService;

@Configuration
public class WorkersConfig {

	@Autowired
	@Qualifier("firefighterServiceImpl")
	private JobService jobService; // funciona con ese nombre siempre que haya una sola implementacion 
	@Autowired
	@Qualifier("policemanServiceImpl")
	private JobService policemanJobservice;
	/**@Bean
	public FirefighterServiceImpl firefighterService() {
		return new FirefighterServiceImpl();
	} **/
	
	@Bean
	public Person juan() {
		Person person = new Person("Juan",jobService,"CWFVEWQER332");
		return person;
	}
	
	@Bean
	public Person jose() {
		Person person2 = new Person("Jose",policemanJobservice,"CWFVEWQER334");
		return person2;
	}
	
}
