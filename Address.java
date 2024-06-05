package com.spring;

public class Address {

	private int rno;
	private String city;
	private long pincode;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Address(int rno, String city, long pincode) {
		super();
		this.rno = rno;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [rno=" + rno + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
