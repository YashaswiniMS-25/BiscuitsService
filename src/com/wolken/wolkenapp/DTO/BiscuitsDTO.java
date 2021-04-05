package com.wolken.wolkenapp.DTO;

public class BiscuitsDTO implements Comparable<BiscuitsDTO>{
	private String name;
	private int id;
	private int quantity;
	private String brand;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "id"+this.getId()+"name="+this.getName()+" brand"+this.getBrand()+" quantity"+this.getQuantity()+" price"+this.getPrice();
	}
	
	@Override
	public int hashCode() {
		return this.id;
		
	}
	
	@Override
	public int compareTo(BiscuitsDTO o) {
		// TODO Auto-generated method stub
		return this.hashCode()-o.hashCode();
	}
	
	

}
