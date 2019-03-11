package com.synechron.training.variables;

public class PersonObjects {

	
	public static void main(String[] args) {
		
		
		Person p1 = new Person("abc", 12, 12.2, false);
		Person p2 = new Person("pqr", 10, 12.2, false);
		
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("*************");
		String objStatus =p1.toString();
		System.out.println(objStatus);
//		p2.toString();
		
	
	}

}
