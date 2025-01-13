package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MyOrder {
	@Id
	private String id;
	private String address;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	public MyOrder() {
		super();
	}

	public MyOrder(String id, String address, Customer customer) {
		this.id = id;
		this.address = address;
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "MyOrder [id=" + id + ", address=" + address + ", customer=" + customer + "]";
	}

	
}
