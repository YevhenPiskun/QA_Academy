package com.playtika.homework.com.homework9;

import java.util.List;

import static com.playtika.homework.com.homework9.Sex.MALE;

public class MiddleSalaryOfMaleEmployees implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Средняя зарплата мужчин: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex().equals(Sex.MALE))
                .mapToDouble(Employee::getSalary)
                .average());
        System.out.println();
    }
}
