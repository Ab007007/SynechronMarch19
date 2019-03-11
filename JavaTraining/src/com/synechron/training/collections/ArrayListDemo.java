package com.synechron.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.synechron.training.variables.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//List al = new ArrayList();
		List al = new LinkedList();
	
		
		al.add(4);
		al.add("abcd");
		al.add(4.4);
		al.add(true);
		al.add(0,12321);
		al.add(new Employee("aa", 12, 12.2, true, "syn123", "12123321", "abc@synechron.com", "Bangalore"));
		al.add(new Employee("adfdsf", 333, 22.2, true, "asdfa", "asdf", "asdfasdf", "asdfasdf"));
		printUsingForEach(al);

		System.out.println("*******************************Updating collections");
		al.add(0,"NEW ITEM");
		printUsingForEach(al); 

		System.out.println("*******************************Removing element in  collections");
		al.remove(4);
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
