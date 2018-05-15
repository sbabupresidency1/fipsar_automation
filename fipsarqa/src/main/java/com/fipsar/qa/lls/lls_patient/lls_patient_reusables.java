package com.fipsar.qa.lls.lls_patient;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fipsar.qa.commands.Navigate;
import com.fipsar.qa.commands.Manipulation;
import com.fipsar.qa.utils.Directory;

public class lls_patient_reusables implements	OR {

	public  static void patientLogin(WebDriver driver)
	{
		Navigate.get(driver, Directory.lls_login_url);

		WebElement patient_username= driver.findElement(By.xpath(OR.PATIENT_USERNAME));		
		WebElement patient_password= driver.findElement(By.xpath(OR.PATIENT_PASSWORD));		
		WebElement login_button= driver.findElement(By.xpath(OR.PATIENT_SUBMIT));		
		Manipulation.click(login_button);
		WebElement patientUsernameRequired= driver.findElement(By.xpath(OR.PATIENT_LOGIN_USERNAME_REQUIRED));
		WebElement patientPasswordRequired= driver.findElement(By.xpath(OR.PATIENT_LOGIN_PASSWORD_REQUIRED));
		Manipulation.verifyElementIsPresent(driver, patientUsernameRequired);
		Manipulation.verifyElementIsPresent(driver, patientPasswordRequired);
		Manipulation.sendKeys(patient_username,Directory.lls_patient_userName);
		Manipulation.sendKeys(patient_password, Directory.lls_patient_password);
		Manipulation.click(login_button);
		Manipulation.wait(driver, "8");      
	}
	
	/*
	 * Input data as Patient/ Provider / Pharmacy
	 */
	public  static void regSelection(WebDriver driver, String inputData)
	{
		Navigate.get(driver, Directory.lls_reg_url);
		//Navigate.get(driver, "https://copayqa.copays.org/portal-redesign#/?_k=900bxm");
		WebElement selectportal= driver.findElement(By.xpath(OR.PORTAL_SELECTION));			
		Manipulation.selectByVisibletext(selectportal, inputData);		
		Manipulation.wait(driver, "1");
	}
	public  static void loginSelection(WebDriver driver, String inputData)
	{
		Navigate.get(driver, Directory.lls_login_url);
		//Navigate.get(driver, "https://copayqa.copays.org/portal-redesign#/?_k=900bxm");
		WebElement selectportal= driver.findElement(By.xpath(OR.PORTAL_SELECTION));			
		Manipulation.selectByVisibletext(selectportal, inputData);		
		Manipulation.wait(driver, "1");
	}

/**

 * Description :
 * Ticket ID :
 * Required Inputs :
 * Purpose :
 */
public static void ssnInput(WebDriver driver){
	// initialize a Random object somewhere; you should only need one
	Random random = new Random();

	// generate a random integer from 0 to 899, then add 100
	int x = random.nextInt(900) + 100;	String ssn_1 = Integer.toString(x); System.out.println(x);
	int y = random.nextInt(10) + 90;	String ssn_2 = Integer.toString(y);System.out.println(y);
	int z = random.nextInt(9000) + 1000;	String ssn_3 = Integer.toString(z);System.out.println(z);
	
	WebElement ssn1= driver.findElement(By.id(OR.SSN1));		
	WebElement ssn2= driver.findElement(By.id(OR.SSN2));		
	WebElement ssn3= driver.findElement(By.id(OR.SSN3));
	
	Manipulation.sendKeys(ssn1, "101");
	Manipulation.sendKeys(ssn2, "24");
	Manipulation.sendKeys(ssn3, ssn_3);
	Manipulation.wait(driver, "2");
	
}

}
