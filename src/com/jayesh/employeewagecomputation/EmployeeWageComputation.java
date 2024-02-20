package com.jayesh.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	private static final int PartTime_DailyWage = 0;

	public static void main(String[] args) {
		
		int attendance;
		int employee_type;
		int dailyWage = 0;
		int total_Wage = 0;
		int i; 
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WAGE_PER_MONTHDAY=20;
	
		System.out.println("Welcome to Employee Wage Computation Program");
		
		for(i = 1 ; i <= WAGE_PER_MONTHDAY; i++ )
		{
			System.out.println("Day : "+ i );
		
			Random random = new Random();
			attendance = random.nextInt(9) % 2; 
			
			switch(attendance)
		
				{
					case 0:
					System.out.println("Employee is Absent");
					break;
					
					case 1:
					System.out.println("Employee is Present");
	
					employee_type = random.nextInt(9) % 2;
					
						
						switch(employee_type)
						{
							
							case 0:
								System.out.println("Employee is a Part Time");
								dailyWage = PART_TIME_HR * WAGE_PER_HR;
					
								break;
								
							case 1:
								System.out.println("Employee is a Full Time");
								dailyWage = FULL_TIME_HR * WAGE_PER_HR;
							
								break;	
								
							}
						total_Wage += dailyWage;
						System.out.println("Employee Wage = " + dailyWage);	
						break;
							
					}
					
					System.out.println("---------------------");
				}
					System.out.println("Total Monthly Wage = "+ total_Wage);
		}
}