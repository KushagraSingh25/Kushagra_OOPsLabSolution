package com.credentials.main;

import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.service.Credentials;

public class DriverClass {

	public static void main(String[] agrs) {
		Scanner in=new Scanner(System.in);
		System.out.println("first name ::");
		String firstName=in.nextLine();
		System.out.println("last name ::");
		String lastName=in.nextLine();
		
		Employee e1=new Employee(firstName, lastName);
		
		Credentials cs=new Credentials();
				
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option=in.nextInt();
		
		switch (option) {
		case 1:
			cs.showCredentials(e1, "tech");
			break;
		case 2:
			cs.showCredentials(e1, "admin");
			break;
		case 3:
			cs.showCredentials(e1, "HR");
			break;
		case 4:
			cs.showCredentials(e1, "legal");
			break;
		default:
			System.out.println("Invalid Department!");
			break;
			
		}
		in.close();
	}
}
