package com.synechron.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.synechron.training.variables.Employee;

public class MapsDemo 
{
	public static void main(String[] args) 
	{
		//Map mp = new HashMap();
		//Map mp = new LinkedHashMap<>();
		Map mp =  new TreeMap<>();
		mp.put("emp1", "Employee10");
		mp.put("emp3", "Employee1");
		mp.put("emp2", "Employee5");
		mp.put("emp6", "Employee2");
		mp.put("emp5", "Employee3");
		mp.put("emp4", new Employee("aaa", 23, 33, true, "aa", "wer", "sdf", "sadf"));
		
		System.out.println(mp.get("emp6"));
		
		Set entries = mp.entrySet();
		
		SetDemo.printSetItems(entries);
		
		System.out.println("Getting only keys");
		Set keys = mp.keySet();
		SetDemo.printSetItems(keys);
		Object key=null;
		System.out.println("Printng values ");
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			key = it.next();
			System.out.println(key + "-" + mp.get(key));
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
