package com.bridgelabz.EmpWageBuilder;

import java.util.ArrayList;

public class EmployeeWageComputation implements EmpWageBuilder {
        // class constants
        public static final int PART_TIME = 1;
        public static final int FULL_TIME = 2;
        // instance variables
        ArrayList<CompanyEmpWage>companies;

        public EmployeeWageComputation(int noOfCompanies)
        {
            companies = new ArrayList<>();
        }

        public void addCompany(String companyName, int wagePerHour, int workingDays, int workingHours)
        {
            CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHour, workingDays, workingHours);
            companies.add(company);
        }

        int generateEmployeeType()
        {
            return (int) (Math.random() * 100) % 3;
        }

        int getWorkingHrs(int EmpCheck)
        {
            switch (EmpCheck)
            {
                case FULL_TIME:
                    return 8;
                case PART_TIME:
                    return 4;
                default:
                    return 0;
            }
        }

        public void calculateTotalWage()
        {
            for (CompanyEmpWage company : companies)
            {
                int totalWage = calculateTotalWage(company);
                company.setTotalEmployeeWage(totalWage);
                System.out.println(company);
            }
        }

        int calculateTotalWage(CompanyEmpWage companyEmpWage)
        {
            System.out.println("Computation of total wage of " + companyEmpWage.CompanyName + " employee");
            System.out.println("-----------------------------------------------------");
            System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

            int workingHours, TotalWage = 0;
            for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.WorkingDays
                    && totalWorkingHrs <= companyEmpWage.WagePerHour; day++, totalWorkingHrs += workingHours)
            {
                int EmpCheck = generateEmployeeType();
                workingHours = getWorkingHrs(EmpCheck);
                int wage = workingHours * companyEmpWage.WagePerHour;
                TotalWage += wage;
                System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs + workingHours);
            }
            return TotalWage;
        }

        public static void main(String args[])
        {
            EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation(3);
            employeeWageComputation.addCompany("TCS", 20, 17, 8);
            employeeWageComputation.addCompany("INFOSYS", 20, 13, 8);
            employeeWageComputation.addCompany("BTS", 20, 19, 8);
            employeeWageComputation.calculateTotalWage();
        }
    }


