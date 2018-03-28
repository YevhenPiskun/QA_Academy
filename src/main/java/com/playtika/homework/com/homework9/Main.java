package com.playtika.homework.com.homework9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadingFromFile readingFromFile = new ReadingFromFile();
        List<Employee> list = readingFromFile.createListOfEmployees(readingFromFile.readFromFile());

        List<Reportable> reports = new ArrayList<>();
        reports.add(new CountOfFemale());
        reports.add(new CountOfMenWithSalaryMoreThen10000());
        reports.add(new MaxSalaryOfEmployeeWithNameNikolay());
        reports.add(new MinSalaryOfEmployeeWithNameSvetlana());
        reports.add(new FioOfEmployeesWhoWorksMore10YearsInThisCompany());
        reports.add(new CountOfFiredEmployeesInLastYear());
        reports.add(new IndexingEmployeesByInn());

        for (int i = 0; i < reports.size(); i++) {
            reports.get(i).report(list);
        }
    }
}
