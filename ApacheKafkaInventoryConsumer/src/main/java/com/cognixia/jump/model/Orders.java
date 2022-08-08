package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Date datePurchased;
	
	private String item;
	
	private Integer quantity;
	
	public Orders() {
		
	}

	public Orders(Integer id, Date datePurchased, String item, Integer quantity) {
		super();
		this.id = id;
		this.datePurchased = datePurchased;
		this.item = item;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", datePurchased=" + datePurchased + ", item=" + item + ", quantity=" + quantity
				+ "]";
	}
}
