package patient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fipsar.qa.commands.Navigate;
import com.fipsar.qa.commands.Manipulation;
import com.fipsar.qa.utils.Directory;

public class patient_reusables implements	OR {

	public  static void patientLogin(WebDriver driver)
	{
		Navigate.get(driver, Directory.patient_url);
		Navigate.maximize(driver);
		WebElement patient_username= driver.findElement(By.xpath(OR.PATIENT_USERNAME));
		
		WebElement patient_password= driver.findElement(By.xpath(OR.PATIENT_PASSWORD));
		
		WebElement login_button= driver.findElement(By.xpath(OR.PATIENT_SUBMIT));
		
		Manipulation.click(login_button);
		WebElement patientUsernameRequired= driver.findElement(By.xpath(OR.PATIENT_LOGIN_USERNAME_REQUIRED));
		WebElement patientPasswordRequired= driver.findElement(By.xpath(OR.PATIENT_LOGIN_PASSWORD_REQUIRED));
		Manipulation.verifyElementIsPresent(driver, patientUsernameRequired);
		Manipulation.verifyElementIsPresent(driver, patientPasswordRequired);
		Manipulation.sendKeys(patient_username,Directory.patient_username);
		Manipulation.sendKeys(patient_password, Directory.patient_password);
		Manipulation.click(login_button);
		Manipulation.wait(driver, "5");
		System.out.println("Patient Logged in successfully");
		
		
	}
}
