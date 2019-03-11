package com.synechron.training.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
	public static void main(String[] args) throws IOException 
	{
		File file  = new File("data\\test.txt");
		String line=null;
		System.out.println(file.getAbsolutePath());
		FileReader fr  =  new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
	//	System.out.println(br.readLine());
//		System.out.println(fr.read());
	br.close();
	fr.close();
	
	
	}

}
