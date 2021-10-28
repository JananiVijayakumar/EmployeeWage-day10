package com.bridgelabz.EmpWageBuilder;

interface EmpWageBuilder {
    public void addCompany(String companyName, int wagePerHour, int workingDays, int workingHours);

    public void calculateTotalWage();
}
