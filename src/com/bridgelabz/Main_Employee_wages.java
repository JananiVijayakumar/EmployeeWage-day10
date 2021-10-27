package com.bridgelabz;

public class Main_Employee_wages {
        public static void main(String[] args)
        {
            System.out.println("welcome to employee wage computational program");
            System.out.println();
            System.out.println("Employee Wage for Multiple Company");
            System.out.println(".........................................................");
            Employee_wages employee_wages1=new Employee_wages();
            employee_wages1.WagesPerCompany(30, "TCS");
            employee_wages1.EmployeeCheck(22,120,300);
            System.out.println("....................................................");
            employee_wages1.WagesPerCompany(10, "INFOSYS");
            employee_wages1.EmployeeCheck(20,110,200);
            System.out.println(".......................................................");
            employee_wages1.WagesPerCompany(15, "ACCENTURE");
            employee_wages1.EmployeeCheck(15,115,250);
            System.out.println(".........................................................");
            employee_wages1.WagesPerCompany(20, "BTS");
            employee_wages1.EmployeeCheck(20,250,400);


        }

    }

