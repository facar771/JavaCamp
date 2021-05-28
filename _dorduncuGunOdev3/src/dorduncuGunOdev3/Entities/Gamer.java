package dorduncuGunOdev3.Entities;

import java.util.Date;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private Date birthDay;
	
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String identificationNumber, Date birthDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.birthDay = birthDay;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
}
