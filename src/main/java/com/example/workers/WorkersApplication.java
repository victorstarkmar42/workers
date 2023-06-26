package com.example.workers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.workers.people.Person;

@SpringBootApplication
public class WorkersApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(WorkersApplication.class, args);
		//Person person = applicationContext.getBean(Person.class);
		
		Person juan = applicationContext.getBean("juan", Person.class);
		Person jose = applicationContext.getBean("jose", Person.class);
		
		System.out.println(juan.getName()+" "+juan.getCurp()+" "+juan.getJob().work());
		System.out.println(jose.getName()+" "+jose.getCurp()+" "+jose.getJob().work());
	}

}
