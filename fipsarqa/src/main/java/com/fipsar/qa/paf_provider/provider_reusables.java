package com.fipsar.qa.paf_provider;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fipsar.qa.commands.Navigate;
import com.fipsar.qa.paf_provider.OR;
import com.fipsar.qa.commands.Manipulation;
import com.fipsar.qa.utils.Directory;

public class provider_reusables implements	OR {

	public  static void providerLogin(WebDriver driver)
	{
		Navigate.get(driver, Directory.copayqa_login_url);

		WebElement provider_username= driver.findElement(By.xpath(OR.PROVIDER_USERNAME));		
		WebElement provider_password= driver.findElement(By.xpath(OR.PROVIDER_PASSWORD));		
		WebElement login_button= driver.findElement(By.xpath(OR.PROVIDER_SUBMIT));		
		Manipulation.sendKeys(provider_username,Directory.provider_username);
		Manipulation.sendKeys(provider_password, Directory.provider_password);
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
}