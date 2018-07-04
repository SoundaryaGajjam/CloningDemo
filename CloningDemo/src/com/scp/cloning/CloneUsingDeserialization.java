package com.scp.cloning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//cloning using deserialization

public class CloneUsingDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address1  ad1=new Address1(411052, "Pune");
		Employee e1=new Employee(10,"Radha", ad1);
		FileOutputStream fos=new FileOutputStream(new File("abc.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee newEmp=(Employee)ois.readObject();
		System.out.println(e1==newEmp);
		System.out.println("Before modification : ");
		System.out.println("Name : "+(e1.empName==newEmp.empName));
		System.out.println("Address : "+(e1.getAddress1()==newEmp.getAddress1()));
		System.out.println("City : "+(e1.getAddress1().city==newEmp.getAddress1().city));
	}
}
