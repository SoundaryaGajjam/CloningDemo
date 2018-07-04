package com.scp.cloning;

public class ShallowNDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a1=new Address(411052, "Pune");
		Student s1=new Student(10, "John",a1);
		Student s2=s1.clone();
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		System.out.println("S1==s2 : "+(s1==s2));
		
		/*//Deep cloning
		System.out.println("Address : "+(s1.getAddress()==s2.getAddress()));
		System.out.println("Before modification ");
		Integer a=s1.getAddress().getCity().hashCode();
		System.out.println("s1 City : "+a.intValue());
		a=s2.getAddress().getCity().hashCode();
		System.out.println("S2 city : "+a.intValue());
		
		s2.getAddress().setCity("Mumbai");
		
		System.out.println("After modification ");
		a=s1.getAddress().getCity().hashCode();
		System.out.println("s1 city : "+a.intValue());
		a=s2.getAddress().getCity().hashCode();
		System.out.println("s2 city : "+a.intValue());
		System.out.println("s1");
		System.out.println(s1);
		System.out.println("s2");
		System.out.println(s2);
		*/
		
		 //Shallow Cloning
		  
		 System.out.println("Before Modification ---");
		System.out.println("Name : "+(s1.studName==s2.studName));
		Integer i1=s1.getStudName().hashCode();
		System.out.println("s1 Name : "+i1.intValue());
		i1=s2.getStudName().hashCode();
		System.out.println("s2 Name : "+i1.intValue());
		
		/*s1.setStudName("Smith");
		
		System.out.println("After modification ----");
		System.out.println("Name : "+(s1.studName==s2.studName));
		i1=s1.getStudName().hashCode();
		System.out.println("s1 Name : "+i1.intValue());
		i1=s2.getStudName().hashCode();
		System.out.println("s2 Name : "+i1.intValue());*/
	}

}
class Student implements Cloneable{
	int studId;
	String studName;
	Address address;
	public Student(int studId, String studName,Address address) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.address=address;
	}
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		Student st=(Student)super.clone();
		Address ad=st.getAddress().clone();
		st.setAddress(ad);
		return st;
	}

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + ", address=" + address + "]";
	}

	
	
}
class Address implements Cloneable{
	int pincode;
	String city;
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nAddress [pincode=" + pincode + ", city=" + city + "]";
	}
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}
	
	

}
