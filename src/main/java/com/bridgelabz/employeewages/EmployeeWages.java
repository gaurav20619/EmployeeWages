package com.bridgelabz.employeewages;

public class EmployeeWages {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfWorkingDays = 20;
    
    
    public static void main(String[] args) {
        // variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmployeeWage = 0;
        // computation
        for (int day = 0; day<numOfWorkingDays; day++){
            int empCheck = (int)(Math.random()*3);
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            empWage = empHrs * empRatePerHour;
            totalEmployeeWage+=empWage;
            System.out.println("Emp Wage is "+ empWage);
        }
        System.out.println("Total Emp Wage is "+ totalEmployeeWage);
    }
}
