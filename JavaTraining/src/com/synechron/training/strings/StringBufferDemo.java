package com.synechron.training.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer("abc xyz pqr");
		StringBuilder sb = new StringBuilder("abc xyz pqr");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append(123);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.charAt(0));
	//	System.out.println(sb.reverse());
		System.out.println(sb.substring(0));
		sb.insert(4, "new ");
		System.out.println(sb);
		sb.delete(4, sb.indexOf("new ")+ 4);
		System.out.println(sb);
		sb.replace(0, 3, "XXXX");
		System.out.println(sb);
		
		
	}
	
}
