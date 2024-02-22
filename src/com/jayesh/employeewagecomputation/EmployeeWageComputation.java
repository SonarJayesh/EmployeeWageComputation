package com.jayesh.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int employee_type;
		int dailyWage = 0;
		int total_Wage = 0;
		int Total_Working_Hr = 0;
		int Total_Working_Days = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WAGE_PER_MONTHDAY=20;
		final int MONTHLY_HR = 100;
	
		System.out.println("Welcome to Employee Wage Computation Program");
		
		while(Total_Working_Hr <= MONTHLY_HR && Total_Working_Days <= WAGE_PER_MONTHDAY)
		{
			System.out.println("Day : "+ Total_Working_Days  );
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
								Total_Working_Hr += PART_TIME_HR;
					
								break;
								
							case 1:
								System.out.println("Employee is a Full Time");
								dailyWage = FULL_TIME_HR * WAGE_PER_HR;
								Total_Working_Hr += FULL_TIME_HR;
								
								break;	
								
							}
						total_Wage += dailyWage;
						System.out.println("Employee Wage = " + dailyWage);	
						break;
							
					}
					System.out.println("Total Working Hr = " + Total_Working_Hr);
					System.out.println("---------------------");
					 Total_Working_Days++;
					
				}
					System.out.println("Total Monthly Wage = "+ total_Wage);
		}
}