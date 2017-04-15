package org.bridgelab.addbookApp.Model;

public class Person {
	private String firstName;
	private String lastNmae;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String phoneNumber;

	
	
	public String toString() {
	     
		return  firstName +"\t   " + lastNmae + "\t   " + address + "\t\t " + city
				+ "\t   " + state + "\t   " + zipcode + "\t   " + phoneNumber + "\n ";
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNmae() {
		return lastNmae;
	}

	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
