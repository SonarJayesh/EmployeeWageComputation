package com.jayesh.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	int attendance;
	int employee_type;
	int dailyWage = 0;
	int total_Wage = 0;
	int Total_Working_Hr = 0;
	int Total_Working_Days = 1;
	int wage_Per_Hr;
	final int FULL_TIME_HR = 8;
	final int PART_TIME_HR = 4;
	int wage_Per_MonthDay;
	int monthly_Hr;
	
	public void employeeWageCalc() {
	
	System.out.println("Welcome to Employee Wage Computation Program");
	
	while(Total_Working_Hr <= monthly_Hr && Total_Working_Days <= wage_Per_MonthDay) {
		
		System.out.println("Day : "+ Total_Working_Days  );
		Random random = new Random();
		attendance = random.nextInt(9) % 2;  
		
		switch(attendance) {
		
				case 0:
				System.out.println("Employee is Absent");
				break;
				
				case 1:
				System.out.println("Employee is Present");

				employee_type = random.nextInt(9) % 2;
				
					
					switch(employee_type) {
						
						case 0:
							System.out.println("Employee is a Part Time");
							dailyWage = PART_TIME_HR * wage_Per_MonthDay;
							Total_Working_Hr += PART_TIME_HR;
				
							break;
							
						case 1:
							System.out.println("Employee is a Full Time");
							dailyWage = FULL_TIME_HR * wage_Per_MonthDay;
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
	
		public EmployeeWageComputation(int wage_Per_Hr , int wage_Per_MonthDay, int monthly_Hr ) {
			
			this.wage_Per_Hr = wage_Per_Hr;
			this.wage_Per_MonthDay = wage_Per_MonthDay;
			this.monthly_Hr = monthly_Hr;
		}
	
		public static void main(String[] args) {
		
			EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation(22,18,80);
			employeeWageComputation.employeeWageCalc();
		
			EmployeeWageComputation employeeWageComputation2 = new EmployeeWageComputation(15,22,120);
			employeeWageComputation2.employeeWageCalc();
			
		}
}