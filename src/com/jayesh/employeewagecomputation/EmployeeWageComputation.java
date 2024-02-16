package com.jayesh.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int employee_type;
		int dailyWage = 0;
		int i; 
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_HR = 8;
		final int PART_TIME_HR = 4;
		final int WAGE_PER_MONTHDAY=20;
		int Month_Emp_Part_Time = 0;
		int Month_Emp_Full_Time = 0;
		int MonthlyWage = 0;
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		for(i = 1 ; i <= WAGE_PER_MONTHDAY; i++ )
		{
			System.out.println("Day : "+ i );
		
			Random random = new Random();
			attendance = random.nextInt(9) % 2;
			
			System.out.println(attendance);
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
								System.out.println("Employee Wage is : " + dailyWage);
								Month_Emp_Part_Time +=1;
					
								break;
							
								
							case 1:
								System.out.println("Employee is a Full Time");
								dailyWage = FULL_TIME_HR *WAGE_PER_HR;
								System.out.println("Employee Wage is : " + dailyWage);
								Month_Emp_Full_Time +=1;
								MonthlyWage = Month_Emp_Part_Time * dailyWage;
							
								break;
								
							default:
								System.out.println("Case Is not Match");
								
								
							}
					
					break;
					
					default:
						System.out.println("Case is not Match");
							
					}
					
					System.out.println();
					
					
				}
				
				Random random =new Random();
				employee_type = random.nextInt(3) % 2;
				
				if(employee_type == 0)
				{
					MonthlyWage = Month_Emp_Part_Time *dailyWage;
					System.out.println("Monthly Attendance of Part time Employee" + Month_Emp_Part_Time + "\n" + "Part Time Employee Salary : "+ MonthlyWage );
				}	
				else
				{
					MonthlyWage =  Month_Emp_Full_Time * dailyWage;
					System.out.println("Monthly Attendance of FullTime Employee : " + Month_Emp_Full_Time + "\n "+ "Full time Employee Salary :" + MonthlyWage);
				}
	
		}
	
}