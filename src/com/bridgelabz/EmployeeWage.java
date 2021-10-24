package com.bridgelabz;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;  //initialize the integer
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int Daily_Wage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            Daily_Wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Wage of Employee is : " + Daily_Wage);
        } else {
            System.out.println("Employee is absent");
            Daily_Wage = Daily_Wage;
        }
    }
}
