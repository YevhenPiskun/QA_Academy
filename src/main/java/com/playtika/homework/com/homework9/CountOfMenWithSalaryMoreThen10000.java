package com.playtika.homework.com.homework9;

import java.util.List;

public class CountOfMenWithSalaryMoreThen10000 implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Количество мужчин с зарплатой более 10000: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex() == Sex.MALE)
                .filter(employee -> employee.getSalary() > 10000)
                .count());
        System.out.println();
    }
}
