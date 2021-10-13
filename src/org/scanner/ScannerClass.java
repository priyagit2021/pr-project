package org.scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner pr= new Scanner(System.in);
		
		System.out.print("Enter Employee Id\t");
		int empid=pr.nextInt();
		System.out.println("Employee Id:"+empid);
		
		System.out.println("Enter Employee Name");
		pr.nextLine();
		String name=pr.nextLine();
		System.out.println("Employee Name:"+name);
		
		System.out.println("Enter Employee Email");
		String email=pr.nextLine();
		System.out.println("Employee Email:"+email);
		
		System.out.println("Enter Employee salary");
		float salary=pr.nextFloat();
		System.out.println("Employee Salary:"+salary);
		
		System.out.println("Enter Employee Phno");
		long phno=pr.nextLong();
		System.out.println("Employee Phno:"+phno);
		
		System.out.println("Enter Employee Gender");
		pr.nextLine();
		String Gender=pr.nextLine();
		System.out.println("Employee Gender:"+Gender);
		
		System.out.println("Enter Employee City");
		String City=pr.nextLine();
		System.out.println("Employee City:"+City);
	}   
}
