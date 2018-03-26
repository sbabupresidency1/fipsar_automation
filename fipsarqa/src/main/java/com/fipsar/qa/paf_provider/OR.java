package com.fipsar.qa.paf_provider;

public interface OR {

	public final String PROVIDER_USERNAME="//input[@type='email']";
	public final String PROVIDER_PASSWORD="//input[@type='password']";
	public final String PROVIDER_SUBMIT="//button[text()='Submit']";
	public final String PROVIDER_LOGIN_USERNAME_REQUIRED="//span[contains(text(),'User Name')]";
	public final String PROVIDER_LOGIN_PASSWORD_REQUIRED="//span[contains(text(),'Password')]";
	public final String PORTAL_SELECTION="//section[@id='root']//label[text()='Register as']/following-sibling::div/select";
	public final String PROVIDER_FNAME="fName";
	public final String SSN1="ssn_1";
	public final String SSN2="ssn_2";
	public final String SSN3="ssn_3";
	
}
