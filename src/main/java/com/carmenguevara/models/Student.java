package com.carmenguevara.models;

public class Student {
	
	private int id;
	private String name;
	private boolean active;
	private Address address;
	private String phone;
	
	
	
	public Student() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param active
	 * @param address
	 * @param phone
	 */
	public Student(int id, String name, boolean active, Address address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.address = address;
		this.phone = phone;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {		
		return "Student [id=" + id + ", name=" + name + ", active=" + active + ", address=" + address + ", phone="
				+ phone + "]";
	}
	
	

	

}
