package com.bridgelabz.employeewages;

public class EmployeeWages {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfWorkingDays = 20;
    public static final int maxHrsInMonth = 100;
    
    
    public static void main(String[] args) {
        // variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // computation
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
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
            totalEmpHrs+=empHrs;
            System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+ empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage is "+ totalEmpWage);
    }
}
