package com.synechron.training.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		File f =  new File("data\\newTextFile.txt");
		
		if(f.exists())
		{
			System.out.println("file is already exist.!!!");
		}
		else
		{
			f.createNewFile();
			
		}
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello all, My First Writing program ");
		bw.newLine();
		bw.write("Happy to write through Program....");
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close();
	
	}

}
