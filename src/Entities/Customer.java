package Entities;

import Abstract.Entity;

public class Customer implements Entity{
	

	private int id;
	private int tc;
	private String firstName;
	private String lastName;
	private int bornDate;
	
	public Customer () {
		System.out.println("for gamer everything ok !"); 
	}

	public Customer (int id,int tc,String firstName,String lastName,int bornDate) {
		
		this.id=id;
		this.tc=tc;
		this.firstName=firstName;
		this.lastName=lastName;
		this.bornDate=bornDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBornDate() {
		return bornDate;
	}

	public void setBornDate(int bornDate) {
		this.bornDate = bornDate;
	}

}
