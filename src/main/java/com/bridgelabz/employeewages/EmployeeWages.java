package com.bridgelabz.employeewages;

public class EmployeeWages {
    public static void main(String[] args) {
        //constants
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHour = 20;
        // variables
        int empHrs = 0;
        int empWage = 0;
        // computation
        int empCheck = (int)(Math.random()*3);
        if (empCheck==isPartTime) {
            empHrs = 4;
        }
        else if (empCheck==isFullTime) {
            empHrs = 8;
        }
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage is "+ empWage);
        
    }
}
