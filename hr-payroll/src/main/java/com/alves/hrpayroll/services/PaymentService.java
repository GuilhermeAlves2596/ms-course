package com.alves.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alves.hrpayroll.entities.Payment;
import com.alves.hrpayroll.entities.Worker;
import com.alves.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
