package com.synechron.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set set = new HashSet();
		//Set set = new LinkedHashSet();
		Set set = new TreeSet();
		set.add(123);
		set.add(987);
		set.add(233);
		set.add(987);
		set.add(233);
		set.add(345);
//		System.out.println(set.size());
		
		printSetItems(set);
	}

	public static void printSetItems(Set set) {
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
