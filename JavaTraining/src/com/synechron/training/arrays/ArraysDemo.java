package com.synechron.training.arrays;
import java.util.Scanner;
import javax.xml.soap.SAAJResult;
public class ArraysDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WElcome to Marks Card Entry");
		System.out.println("Enter the total number subjects in Semister");
		int size = sc.nextInt();
		int marks[] = new int[size];
		String grade[]= {"A","B","C","D"};
		System.out.println("Please enter only " +size + " --subject marks...");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Length of an array : " + marks.length);
		for (int i = 0; i < marks.length; i++) 
		{
			System.out.println(marks[i]);
		}
	}
}
