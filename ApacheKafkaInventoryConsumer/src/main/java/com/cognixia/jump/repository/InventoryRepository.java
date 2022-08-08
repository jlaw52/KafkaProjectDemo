package com.cognixia.jump.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

	public Optional<Inventory> findByItemName(String name);
}
