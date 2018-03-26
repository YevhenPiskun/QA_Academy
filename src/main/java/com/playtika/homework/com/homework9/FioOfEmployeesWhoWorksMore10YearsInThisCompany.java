package com.playtika.homework.com.homework9;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FioOfEmployeesWhoWorksMore10YearsInThisCompany implements Reportable {
    @Override
    public void report(List<Employee> list) {
        List<Employee> result = new ArrayList<>();
        System.out.println("ФИО всех сотрудников со стажем работы более 10 лет в данной компании: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getExpirience() >= 10)
                .map(e -> e.getFirstName() + " " + e.getSecondName() + " " + e.getFathersName())
                .collect(toList()));
    }
}
