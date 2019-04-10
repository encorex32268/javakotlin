package com.lee;

public class FinanceReport implements Report {
    @Override
    public void load() {
        System.out.println("FinanceReport loading data");
    }

    @Override
    public void print() {
        System.out.println("FinanceReport printing");
    }
}
