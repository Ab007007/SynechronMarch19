package com.synechron.training.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	public static void main(String[] args) throws IOException {
		
		File file = new File("data\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties props = new Properties();
		props.load(fis);
		
		String un = props.getProperty("username");
		String pw = props.getProperty("password");
		String browser = props.getProperty("browser");
		String timeout = props.getProperty("timeout");
		
		System.out.println(un);
		System.out.println(pw);
		System.out.println(browser);
		System.out.println(timeout);
		fis.close();
	}
}
