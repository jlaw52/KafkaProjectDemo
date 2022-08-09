package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Inventory;
import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.InventoryRepository;

@Service
public class InventoryServiceConsumer {

	@Autowired
	InventoryRepository repo;
	
	@KafkaListener(topics = "purchase", groupId = "message_group_id")
	public void consume(Orders order) {
		System.out.println("Consuming order: " + order);
		Optional<Inventory> purchase = repo.findByItemName(order.getItem());
		if (!purchase.isEmpty()) {
			Inventory purchased = new Inventory();
			purchased.setId(purchase.get().getId());
			purchased.setName(purchase.get().getName());
			purchased.setPrice(purchase.get().getPrice());
			purchased.setQuantity(purchase.get().getQuantity() - order.getQuantity());
			repo.save(purchased);
		}
		else {
			System.out.println("Cannot consume order: purchase is empty");
		}
		
		
		//change purchase.quantity = purchase.getQuantity() - order.getQuantity()
		//repo.save(purchase)
	}
}
