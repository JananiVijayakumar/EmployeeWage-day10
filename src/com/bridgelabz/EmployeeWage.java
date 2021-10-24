package com.bridgelabz;

import java.util.*;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 20;
    public static final int MAX_HOURS_IN_MONTH = 100;

    public static int EmpWage(String company, int Wage_per_hour, int Working_days, int Max_hours_in_month ){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + " Employee Hour : " + empHrs);
            }
        int totalEmpWage = totalEmpHrs + WAGE_PER_HOUR;
        System.out.println("Total employee wage : " +company+ "is: " +totalEmpWage);
        return totalEmpWage;

        }

    public static void main(String[] args) {
        EmpWage("Bangton Entertainment", 20, 2, 10);
        EmpWage("Big Entertainment", 10, 4, 20);

    }
    }

