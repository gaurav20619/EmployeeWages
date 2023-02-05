package com.bridgelabz.employeewages;

public class EmployeeWages {
    public static void main(String[] args) {
        //constants
        int isFullTime = 1;
        int empRatePerHour = 20;
        // variables
        int empHrs = 0;
        int empWage = 0;
        // computation
        int empCheck = (int)(Math.random()*2);
        if (empCheck==isFullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage is "+ empWage);
        
    }
}
