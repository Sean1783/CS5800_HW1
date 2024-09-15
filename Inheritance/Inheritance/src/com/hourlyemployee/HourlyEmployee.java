package com.hourlyemployee;

import com.employee.Employee;

public class HourlyEmployee extends Employee {

    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
