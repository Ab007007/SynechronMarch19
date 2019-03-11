package com.synechron.training.variables;

public class Employee extends Person implements Animal,LivingThings
{

	String empID;
	String dob;
	String officialEmail;
	String officeAddress;
	//public Person(String name,int age, double height,boolean working)
	
	public Employee(String name,int age, double height,boolean working,String
			empid,String dob,String email,String address) 
	{
		this.name = name;
		this.age =age;
		this.height = height;
		this.working =working;
		this.empID = empid;
		this.dob = dob;
		this.officialEmail =email;
		this.officeAddress = address;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() 
				+ " Employee ID " + this.empID 
				+ " DOB " + this.dob
				+ " Office Address " + this.officeAddress
				+ " Email Address " + this.officialEmail;
	}


	public static void main(String[] args) {
		Employee e1 = new 
				Employee("abcd", 30, 6, true,"Syne123", 
						"12Mar90", "abcd@synechron.com",
						"bangalore");
		Employee e2 = new Employee("abcd", 30, 6, true,"Syne123", "12Mar90", "abcd@synechron.com", "bangalore");
		Employee e3 = new Employee("abcd", 30, 6, true,"Syne123", "12Mar90", "abcd@synechron.com", "bangalore");
		Employee e4 = new Employee("abcd", 30, 6, true,"Syne123", "12Mar90", "abcd@synechron.com", "bangalore");
		Employee e5 = new Employee("abcd", 30, 6, true,"Syne123", "12Mar90", "abcd@synechron.com", "bangalore");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
	
	
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Employee eat veg/non-veg");
	}


	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Only when he has time..else run");
		
	}








}
