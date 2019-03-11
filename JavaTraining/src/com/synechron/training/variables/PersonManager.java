package com.synechron.training.variables;

class Person extends Object
{
	
	String name;
	int age;
	double height;
	boolean working;
	static String county="India";
	static final String planet="Earth";
	
	public Person()
	{
		super();
	}
	
	public Person(String name,int age, double height,boolean working)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.working = working;
				
		 
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "person object has Name-" + this.name + " Age - "
				+this.age + " Height -" + this.height + " and Working status "
				+ this.working;
	}
	
	
	
	
	
}

public class PersonManager
{
	/**
	 * @author ahb
	 * @param args
	 * this is my first program after Hello World
	 */
	
	static Person p1,p2 = null;
	public static void main(String[] args)
	{
		p1  = new Person();
		PersonManager pm = new PersonManager();
		pm.printPersonObject(p1); //prints default values
		p1.name="Aravinda";
		p1.age=50;
		p1.height=5.8;
		p1.working=true;
//		Person.county="Sri Lanka";
//		Person.planet="Moon";
		
		pm.printPersonObject(p1); //print assigned values for p1
		
		
		p2  = new Person();
		pm.printPersonObject(p2); // print 
		p2.name="ABCD";
		p2.age=30;
		p2.working=false;
		p2.height=3.3;
//		p2.county="India";
		pm.printPersonObject(p2);
	}		

	void printPersonObject(Person p)
	{
		System.out.println("************ Printing person ***************");
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		System.out.println(p.working);
		System.out.println(Person.county);
		System.out.println(Person.planet);
		System.out.println("****************Ended *********************");
	}
	
	
	
	
	
	
	
}