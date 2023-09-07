package com.example.workers.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.workers.service.impl.EngineerServiceImpl;
import com.example.workers.service.impl.PolicemanServiceImpl;

@ExtendWith(value = { MockitoExtension.class })
public class JobServiceImpTest {
	@Mock
	private InsuranceService insuranceService;
	@Test
	public void workTest() {
		JobService service1 = new PolicemanServiceImpl();
		assertEquals("Policeman",service1.work());
	}
	
	@Test
	public void engineerWorkTest() {
		JobService service2 = new EngineerServiceImpl(insuranceService);
		when(insuranceService.isCovered()).thenReturn(true);
		assertEquals("Engineer",service2.work());
	}
	
}
