package com.bridgelabz;

/**
 * author : jananiVijayakumar
 * date : 24-10-2021
 * employee wage program
**/

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;             //initialize the integer
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
