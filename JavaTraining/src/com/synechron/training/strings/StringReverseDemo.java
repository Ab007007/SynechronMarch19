package com.synechron.training.strings;

public class StringReverseDemo {

	public static void main(String[] args) {
		String str = "hello all welcome to java strings";
		String[] words = str.split(" ");
		System.out.println(str);
		for(String word:words)
		{
			reverseMyString(word);
			
		}
		
		
	}

	private static void reverseMyString(String str) {
		for (int i = str.length()-1; i>=0 ; i--)
		{
			System.out.print(str.charAt(i));
			
		}
		System.out.print(" ");
	}
	
	
	
}
