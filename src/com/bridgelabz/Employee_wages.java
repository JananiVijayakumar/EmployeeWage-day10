package com.bridgelabz;

import java.util.*;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class Employee_wages {

        public void presentOrAbsent()
        {
            Random random=new Random();          //initialiazing the random value for attendance
            int attendence=random.nextInt(2);

            if(attendence==1)
            {
                System.out.println("employee is present");
            }
            else
                System.out.println("employee is absent");
        }

        public void WagesPerCompany(int WagePerHour, String CompanyName){
            CompanyName=CompanyName;
            WagePerHour=WagePerHour;
            int DailyWage=0;
            int TotalWorkingHour=8;
            int MonthlyWage=0;
            System.out.println( "" +CompanyName+ " Company Employee Wage Calculation :");
            System.out.println();
            Random random1=new Random();         //Random value to find Employee is present or absent
            int empCheck=random1.nextInt(2);

            switch(empCheck)
            {
                case 0:
                    TotalWorkingHour=4;
                    DailyWage=WagePerHour*TotalWorkingHour;
                    MonthlyWage=DailyWage*20;
                    System.out.println("Part-time Employee Wage");;
                    System.out.println("Daily wage for Part-time Employee : "+DailyWage);
                    System.out.println("Monthly wage for Part-time Employee : "+MonthlyWage);
                    break;
                case 1:
                    DailyWage=WagePerHour*TotalWorkingHour;
                    MonthlyWage=DailyWage*20;
                    System.out.println("Full-time emplloyee Wage");
                    System.out.println("Daily wage for Full-time Employee : "+DailyWage);
                    System.out.println("Monthly wage for Full-time Employee : "+MonthlyWage);
                    break;
                default:
                    System.out.println("Employee on leave");

            }
        }

        public void EmployeeCheck(int NoOfWorkingDays, int WorkingHoursPerMonth, int WagePerDay)
        {
            int count=0;
            int no_days=31;
            NoOfWorkingDays=NoOfWorkingDays;
            WorkingHoursPerMonth=WorkingHoursPerMonth;
            WagePerDay=WagePerDay;

            for(int i=0; i<=no_days; i++)
            {
                Random random2=new Random();
                int EmpCheck=random2.nextInt(2);

                if(EmpCheck==1)
                {
                    count++;
                }
            }

            System.out.println("No of Working days : "+count);
            int totalWorkingHrs=count*8;

            if (count<NoOfWorkingDays && totalWorkingHrs<WorkingHoursPerMonth)
            {
                int MonthlyWages=count*WagePerDay;
                System.out.println("No of days  Employee Working per month : "+count);
                System.out.println("Employee Wage : "+MonthlyWages);
            }
            else
            {
                System.out.println("work excided");
            }
        }

    }


