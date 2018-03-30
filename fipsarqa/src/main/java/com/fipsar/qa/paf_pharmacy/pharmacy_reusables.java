package com.fipsar.qa.paf_pharmacy;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yaml.snakeyaml.events.Event.ID;

import com.fipsar.qa.commands.Navigate;
import com.fipsar.qa.commands.Manipulation;
import com.fipsar.qa.utils.Directory;

public class pharmacy_reusables implements OR {

	public  static void pharmacyLogin(WebDriver driver)
	{
		Navigate.get(driver, Directory.copayqa_login_url);

		WebElement PHARMACY_username= driver.findElement(By.xpath(OR.PHARMACY_USERNAME));		
		WebElement PHARMACY_password= driver.findElement(By.xpath(OR.PHARMACY_PASSWORD));		
		WebElement login_button= driver.findElement(By.xpath(OR.PHARMACY_SUBMIT));		
		Manipulation.sendKeys(PHARMACY_username,Directory.pharmacy_username);
		Manipulation.sendKeys(PHARMACY_password, Directory.pharmacy_password);
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
	/**
	 * Description :
	 * Ticket ID :
	 * Required Inputs :
	 * Purpose :
	 * @return 
	 */
	public static String ssnNineDigit(WebDriver driver, WebElement element){
		// initialize a Random object somewhere; you should only need one
		Random random = new Random();

		// generate a random integer from 0 to 899, then add 100
		int x = random.nextInt(900) + 100;            String ssn_1 = Integer.toString(x); System.out.println(x);
		int y = random.nextInt(10) + 90; String ssn_2 = Integer.toString(y);System.out.println(y);
		int z = random.nextInt(9000) + 1000;        String ssn_3 = Integer.toString(z);System.out.println(z);

		String SSN="101-14-"+ssn_3;
		System.out.println(SSN);
		Manipulation.sendKeys(element, SSN);	                
		Manipulation.wait(driver, "1");
		return SSN;
	}

}
