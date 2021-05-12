package _dorduncuGunOdev.Entities;

import java.sql.Date;

import _dorduncuGunOdev.interfaces.Entity;

public class Customer implements Entity{
	
	private int Id;
	private	String FirstName;
	private String LastName;
	private Date birthDate;
	private String identityNumber;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date birthDate, String identityNumber) {
		super();
		this.Id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.birthDate = birthDate;
		this.identityNumber = identityNumber;
	}

	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
