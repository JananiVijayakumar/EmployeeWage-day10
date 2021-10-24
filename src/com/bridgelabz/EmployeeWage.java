package com.bridgelabz;

import java.util.Random;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class EmployeeWage {
    public void calculate_wage() {

        int IS_FULL_TIME = 1; //initialize the integer
        int IS_PART_TIME = 0;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int Daily_Wage = 0;
        int Working_Day = 20;
        int Monthly_Wage = 0;
        int NO_OF_DAYS = 20;
        int count = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        for (int i = 0; i <= NO_OF_DAYS; i++) {
            Random random = new Random();
            int EmployeeWage = random.nextInt(2);
            if (EmployeeWage == 1) {
                count++;
            }
            System.out.println("no of days :"+count);
            Daily_Wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily wage is : " +Daily_Wage);
            int total_working_hrs=count*20;
            if(count<=20 || total_working_hrs<100){
                int Salary_per_month=count*Daily_Wage;
                System.out.println("no of days employee coming to work :"+count);
                System.out.println("Salary per month depending on attendance:"+Salary_per_month);
            }
            else{
                System.out.println("Employee is not attend the work");
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("welcome to employee wage computation program");
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.calculate_wage();

    }
}
