package com.bridgelabz;

import java.util.*;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class CompanyEmpWage {
        // instance constants
        final String CompanyName;
        final int WagePerHour;
        final int WorkingDays;
        final int WorkingHours;
        // instance variable
        int TotalEmpWage;

        CompanyEmpWage(String companyName, int wagePerHr, int workingDays, int workingHours)
        {
            CompanyName = companyName;
            WagePerHour = wagePerHr;
            WorkingDays = workingDays;
            WorkingHours = workingHours;
            TotalEmpWage = 0;
        }

        void setTotalEmployeeWage(int TotalEmpWage)
        {
            this.TotalEmpWage = TotalEmpWage;
        }

        public String toString()
        {
            System.out.println("Details of " + CompanyName + " employee");
            System.out.println("-----------------------------------------------------");
            System.err.println("Wage per hour:" + WagePerHour);
            System.out.println("Maximum working days:" + WorkingDays);
            System.out.println("Maximum working hours:" + WorkingHours);
            return "Total wage for a month of " + CompanyName + " employee is " + TotalEmpWage + "\n";
        }
    }




