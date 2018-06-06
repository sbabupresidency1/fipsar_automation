package com.fipsar.qa.lls.lls_pharmacy;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fipsar.qa.commands.Navigate;
import com.fipsar.qa.lls.lls_provider.OR;
import com.fipsar.qa.commands.Manipulation;
import com.fipsar.qa.utils.Directory;

public class lls_Pharmacy_reusables implements	OR {

	public  static void pharmacyLogin(WebDriver driver)
	{
		Navigate.get(driver, Directory.lls_login_url);

		WebElement provider_username= driver.findElement(By.xpath(OR.PROVIDER_USERNAME));		
		WebElement provider_password= driver.findElement(By.xpath(OR.PROVIDER_PASSWORD));		
		WebElement login_button= driver.findElement(By.xpath(OR.PROVIDER_SUBMIT));		
		Manipulation.sendKeys(provider_username,Directory.lls_pharmacy_username);
		Manipulation.sendKeys(provider_password, Directory.lls_pharmacy_password);
		Manipulation.click(login_button);		
		Manipulation.wait(driver, "3");
		try {
			if(driver.findElement( By.id( "Old" ) ).isDisplayed())
			{
				WebElement webElement=driver.findElement(By.id("Old"));
				Manipulation.click(webElement);
				Manipulation.wait(driver, "5");
			}	}	
			catch(Exception e) {
				Manipulation.wait(driver, "3");
			}	
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
