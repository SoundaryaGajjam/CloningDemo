package com.scp.cloning;

import java.io.Serializable;

public class Employee implements Serializable{
	int empId;
	String empName;
	Address1 address;
	public Employee(int empId, String empName,Address1 address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address=address;
	}
	
	public Address1 getAddress1() {
		return address;
	}

	public void setAddress1(Address1 address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
}
class Address1 implements Serializable{
	int pincode;
	String city;
	public Address1(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nAddress1 [pincode=" + pincode + ", city=" + city + "]";
	}
	
}
