package com.synechron.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	public static String getMyPropertyValue(String propertyName)
	{
		System.out.println("********************* Welcome to property file Reader **********************************");
		System.out.println("Reading " + propertyName + " from the property file ");
		System.out.println("****************************************************************************************");
		File file = null;
		FileInputStream fis = null;
		Properties props = null;
		try
		{
		file = new File("data\\config.properties");
		fis = new FileInputStream(file);
		props = new Properties();
		props.load(fis);
		return props.getProperty(propertyName);
		
		}
		catch (Exception e) {
				System.out.println("Exception while reading config file");
				return null;
		}
		finally {
			try
			{
				fis.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
