package com.websol.notice.model;

import java.util.List;

public class BuyOrder {
	List<Product> product;
	
	Address addr;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
