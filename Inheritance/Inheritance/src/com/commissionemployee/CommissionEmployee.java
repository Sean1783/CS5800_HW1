package com.commissionemployee;

import com.employee.Employee;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName,
                              String lastName,
                              String socialSecurityNumber,
                              double commissionRate,
                              int grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public void print(){
        printNameAndSSN();
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Gross Sales: " + grossSales);
    }
}
