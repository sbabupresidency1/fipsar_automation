package com.fipsar.qa.paf_patient;

public interface OR {

	public final String PATIENT_USERNAME="//input[@type='email']";
	public final String PATIENT_PASSWORD="//input[@type='password']";
	public final String PATIENT_SUBMIT="//button[text()='Submit']";
	public final String PATIENT_LOGIN_USERNAME_REQUIRED="//span[contains(text(),'User Name')]";
	public final String PATIENT_LOGIN_PASSWORD_REQUIRED="//span[contains(text(),'Password')]";
	public final String PORTAL_SELECTION="//section[@id='root']//label[text()='Register as']/following-sibling::div/select";
	public final String PATIENT_FNAME="fName";
	public final String SSN1="ssn_1";
	public final String SSN2="ssn_2";
	public final String SSN3="ssn_3";
	
}
