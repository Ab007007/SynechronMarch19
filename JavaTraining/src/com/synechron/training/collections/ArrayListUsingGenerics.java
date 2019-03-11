package com.synechron.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.synechron.training.variables.Employee;

public class ArrayListUsingGenerics {

	public static void main(String[] args) {
		
		
	/*	parthibanbvm@gmail.com
		rvsrini75@gmail.com
		ramanswamy@rediffmail.com
		vijayyeamothy@gmail.com
		Pranabmohanty00@gmail.com
		*/
		
		
		//List al = new ArrayList();
		//List al = new LinkedList();
	List<Employee> al = new ArrayList<Employee>();
		
//		al.add
		al.add(new Employee("aa", 12, 12.2, true, "syn123", "12123321", "abc@synechron.com", "Bangalore"));
		al.add(new Employee("adfdsf", 333, 22.2, true, "asdfa", "asdf", "asdfasdf", "asdfasdf"));
		printUsingForEach(al);

		System.out.println("*******************************Updating collections");
		printUsingForEach(al); 

		System.out.println("*******************************Removing element in  collections");
		printUsingForEach(al); 
	}

	public static void printUsingForEach(List al) {
		for (Object object : al) {
			
			System.out.println(object);
		}
	}

	public static void printUsingBasicForLoop(List al) {
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
	}

	public synchronized static void printUsingIterator(List al) {
		Iterator it = al.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}
}
