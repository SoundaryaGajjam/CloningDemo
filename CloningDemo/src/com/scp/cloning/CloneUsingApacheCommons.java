package com.scp.cloning;

import java.io.Serializable;

import org.apache.commons.lang.SerializationUtils;


public class CloneUsingApacheCommons {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(10, "Smith",new Address1(411052, "Pune"));
		Employee e2=(Employee)SerializationUtils.clone(e1);
		System.out.print("e1");
		System.out.println(e1);
		System.out.print("e2");
		System.out.println(e2);
		System.out.println("e1==e2 : "+(e1==e2));
		//apache commons always support deep cloning
		
		//Shallow Cloning
		System.out.println("Before modification Name : "+(e1.getEmpName()==e2.getEmpName()));
		System.out.println("(Before)Content equals : "+(e1.getEmpName().equals(e2.getEmpName())));
		Integer i=e1.getEmpName().hashCode();
		System.out.println("e1 Name : "+i.intValue());
		Integer j=e2.getEmpName().hashCode();
		System.out.println("e2 Name : "+j.intValue());
		//in this case hash code is same bcoz string hashcode is based on contents
		e2.empName="John";
		
		System.out.println("After modification Name : "+(e1.getEmpName()==e2.getEmpName()));
		System.out.println("(After)Content equals : "+(e1.getEmpName().equals(e2.getEmpName())));
		 i=e1.getEmpName().hashCode();
		System.out.println("e1 Name : "+i.intValue());
		i=e2.empName.hashCode();
		System.out.println("e2 Name : "+i.intValue());
		
		
		
		
		
		
		
		
		 // Deep cloning
		 /*System.out.println("Before Modification---");
		System.out.println("City : "+(e1.getAddress1().city==e2.getAddress1().city));
		Integer b=e1.getAddress1().city.hashCode();
		System.out.println("e1 city : "+b.intValue());
		b=e2.getAddress1().city.hashCode();
		System.out.println("e2 city : "+b.intValue());
		
		e2.getAddress1().city="Mumbai";
		
		System.out.println("After modification----");
		System.out.println("City : "+(e1.getAddress1().city==e2.getAddress1().city));
		b=e1.getAddress1().city.hashCode();
		System.out.println("e1 city : "+b.intValue());
		b=e2.getAddress1().city.hashCode();
		System.out.println("e2 city : "+b.intValue());
		*/
		
		
		
		
		
		System.out.print("e1");
		System.out.println(e1);
		System.out.print("e2");
		System.out.println(e2);
		
	}
}
