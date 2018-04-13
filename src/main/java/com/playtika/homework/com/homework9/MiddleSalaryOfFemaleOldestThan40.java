package com.playtika.homework.com.homework9;

import java.util.List;

public class MiddleSalaryOfFemaleOldestThan40 implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Средняя зарплата женщин старше 40-ка лет: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex().equals(Sex.FEMALE))
                .filter(employee -> employee.getAgeOfEmployee() > 40)
                .mapToDouble(Employee::getSalary).average());
        System.out.println();
    }
}
