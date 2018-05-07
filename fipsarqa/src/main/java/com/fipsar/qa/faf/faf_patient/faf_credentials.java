package com.fipsar.qa.faf.faf_patient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.fipsar.qa.utils.Directory;

public class faf_credentials {

	public static void main() throws IOException
	{
		//URLs and Credentials for PAF  - CPR
		Properties fafurlsProperties = new Properties();
		System.out.println("testCasePath: "+Directory.testCasePath);
		InputStream input = new FileInputStream(Directory.testCasePath+"/"+"faf_patients.properties");
		fafurlsProperties.load(input);	
	}
	
}
