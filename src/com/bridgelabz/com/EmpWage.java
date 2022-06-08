package com.bridgelabz.com;

public class EmpWage {
    public static  void main(String[] args)
    {

        int isFullTime=1;
        int EmpHrs=0;
        int EmpWage=0;
        int EmpWagePerHr=20;

        double EmpCheck = Math.floor(Math.random()* 10)%3;

        if (EmpCheck==isFullTime)
        {
            EmpHrs=8;
        }

        EmpWage = EmpHrs * EmpWagePerHr;
        System.out.println("Emp Wage" +EmpWage);
    }

}
