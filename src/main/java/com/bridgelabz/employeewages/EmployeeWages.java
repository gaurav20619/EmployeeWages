package com.bridgelabz.employeewages;

public class EmployeeWages {
    public static void main(String[] args) {
        //constants
        int isFullTime = 1;
        // computation
        int empCheck = (int)(Math.random()*2);
        if (empCheck==isFullTime) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
