package com.playtika.homework.com.homework9;

import java.util.List;

public class MinSalaryOfEmployeeWithNameSvetlana implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Минимальная зарплата у сотрудниц с именем Светлана: ");
        System.out.println(list.stream()
        .filter(employee -> "Светлана".equals(employee.getSecondName()))
        .mapToDouble(Employee::getSalary)
        .min());
        System.out.println();
    }
}
