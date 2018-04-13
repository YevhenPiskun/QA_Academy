package com.playtika.homework.com.homework9;

import java.util.List;

public class MiddleAgeOfEmployees implements Reportable {

    @Override
    public void report(List<Employee> list) {
        System.out.println("Средний возраст сотрудников: ");
        System.out.println(list.stream()
                .mapToInt(Employee::getAgeOfEmployee)
                .average());
        System.out.println();
    }
}
