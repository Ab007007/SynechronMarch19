package com.synechron.training.exceptions;

public class RunTimeExceptionDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started...");
		String str="abc";
		System.out.println(str.charAt(0));
		getMyIndexValue(str);
		System.out.println(str.charAt(1));
		System.out.println("Main Ended...");
		
	}

	private static void getMyIndexValue(String str) {
		try
		{
			int a[] = new int[2];
			a[0] = 100;
			a[1] = 200;
			for(int i=0;i<a.length+1;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			//ex.printStackTrace();
			System.out.println("EXCEPTION- Please check the index -->" + ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("EXCEPTION- Please check the index -->" + ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Generic Exception");
		}
	}

}
