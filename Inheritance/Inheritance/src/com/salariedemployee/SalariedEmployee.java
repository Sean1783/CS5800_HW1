package com.salariedemployee;

import com.employee.Employee;

public class SalariedEmployee extends Employee {

    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, int weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void print(){
        printNameAndSSN();
        System.out.println("Weekly salary: " + weeklySalary);
    }
}
