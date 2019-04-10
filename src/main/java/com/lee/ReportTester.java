package com.lee;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {

    public static void main(String[] args) {
        Report report1 = new FinanceReport();
        Report report2 = new HealthReport();
        List<Report> reportsList = new ArrayList<>();
        reportsList.add(report1);
        reportsList.add(report2);
        for (Report report : reportsList){
            report.load();
            report.print();
        }
    }
}
