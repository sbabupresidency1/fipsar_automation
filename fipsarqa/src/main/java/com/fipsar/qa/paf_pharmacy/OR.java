package com.fipsar.qa.paf_pharmacy;

public interface OR {

	public final String PHARMACY_USERNAME="//input[@type='email']";
	public final String PHARMACY_PASSWORD="//input[@type='password']";
	public final String PHARMACY_SUBMIT="//button[text()='Submit']";
	public final String PHARMACY_LOGIN_USERNAME_REQUIRED="//span[contains(text(),'User Name')]";
	public final String PHARMACY_LOGIN_PASSWORD_REQUIRED="//span[contains(text(),'Password')]";
	public final String PORTAL_SELECTION="//section[@id='root']//label[text()='Register as']/following-sibling::div/select";
	public final String PHARMACY_FNAME="fName";
	public final String SSN="";
	
}
