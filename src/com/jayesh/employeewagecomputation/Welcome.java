package com.jayesh.employeewagecomputation;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance=0;
		
		System.out.print("Enter Attendance [ 0 for Absend / 1 for Present  ] :");
		
		Scanner obj =new Scanner(System.in);
		attendance=obj.nextInt();
		
		if(attendance==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
		
	}

}
