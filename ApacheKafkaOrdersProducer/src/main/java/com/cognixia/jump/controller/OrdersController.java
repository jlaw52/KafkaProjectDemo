package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.service.OrderServiceProducer;

@RestController
public class OrdersController {

	@Autowired
	OrderServiceProducer service;
	
	@PostMapping("/generate")
	public Orders generateOrder(@RequestBody Orders order) {
		service.produce(order);
		return order;
	}
}
