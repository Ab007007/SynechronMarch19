package com.synechron.training.strings;

public class StringsDemo {

	public static void main(String[] args) {
		String str = "Hello all, welcome to the world of Strings   ";
		
		System.out.println("Length of a String " + str.length());
		
		System.out.println(str.indexOf("w"));
		
		System.out.println(str.lastIndexOf("w"));
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.replaceAll("w", "W"));
		
		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());
		
		System.out.println(str.substring(11));
		
		System.out.println(str.substring(11, str.lastIndexOf("w")));
		
		String[] words = str.split(" ");
		
		for(String word:words)
		{
			System.out.println(word);
		}
		
		System.out.println(str.trim());
		
		System.out.println(str.contains("welcome1"));
	
		
		
		/*System.out.println(str);
		System.out.println(str.hashCode());
		str = str.concat("123");
		System.out.println(str);
		System.out.println(str.hashCode());*/
	}
}
