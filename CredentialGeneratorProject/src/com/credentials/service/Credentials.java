package com.credentials.service;

import java.util.Random;

import com.credentials.model.Employee;

public class Credentials {
	
	private String generatePassword() {
		Random random=new Random();
		
		String password="";
		for(int i=0;i<=7;i++) {
			password+=(char)random.nextInt(33,123);
		}
		return password;	
	}
	private String generateEmailAddress(Employee e,String department) {
		return e.getFirstName().toLowerCase()+e.getLastName()+"@"+department+".abc.com";
	}
	public void showCredentials(Employee e,String department) {
		System.out.println("Dear "+e.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email   -->" + generateEmailAddress(e,department));
		System.out.println("Password   -->" + generatePassword());
	}
}