package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrderRepository;

@Service
public class OrderServiceProducer {
	
	@Autowired
	OrderRepository repo;

	@Autowired
	private KafkaTemplate<String, Orders> kafkaTemplate;
	
	public void produce(Orders purchase) {
		System.out.println("Producing order: " + purchase);
		kafkaTemplate.send("purchase", purchase);
		repo.save(purchase);
	}
}
