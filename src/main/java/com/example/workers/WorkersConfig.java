package com.example.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.workers.people.Person;
import com.example.workers.service.JobService;
import com.example.workers.service.MilitaryService;

@Configuration
public class WorkersConfig {

	@Autowired
	@Qualifier("firefighterServiceImpl")
	private JobService jobService; // funciona con ese nombre siempre que haya una sola implementacion 
	@Autowired
	@Qualifier("policemanServiceImpl")
	private JobService policemanJobservice;
	
	@Autowired   //inyecta las dependecias
	@Qualifier("capeServiceImpl")
	private MilitaryService capeServiceImpl;
	
	@Autowired   //inyecta las dependecias
	@Qualifier("satintServiceImpl")
	private MilitaryService satintServiceImpl;
	
	@Autowired   //inyecta las dependecias
	@Qualifier("sergeantServiceImpl")
	private MilitaryService sergeantServiceImpl;
	
	
	/**@Bean
	public FirefighterServiceImpl firefighterService() {
		return new FirefighterServiceImpl();
	} **/
	
	@Bean
	public Person juan() {
		Person person = new Person("JUAN",jobService,"CWFVEWQER332");
		return person;
	}
	
	@Bean
	public Person jose() {
		Person person2 = new Person("JOSE",policemanJobservice,"CWFVEWQER334");
		return person2;
	}
	
	@Bean
	public Person aylin() {
		Person person3 = new Person("AYLIN",capeServiceImpl,"CWFVEWQER334");
		return person3;
	}
	
	@Bean
	public Person manuel() {
		Person person4 = new Person("MANUEL",satintServiceImpl,"CWFVEWQER334");
		return person4;
	}
	
	@Bean
	public Person adrian() {
		Person person5 = new Person("ADRIAN",sergeantServiceImpl,"CWFVEWQER334");
		return person5;
	}
	
}
