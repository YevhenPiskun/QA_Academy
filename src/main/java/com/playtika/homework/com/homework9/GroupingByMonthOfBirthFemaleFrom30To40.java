package com.playtika.homework.com.homework9;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByMonthOfBirthFemaleFrom30To40 implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Группировка по месяцам рождения всех женщин в возрасте от 30 до 40 лет: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex().equals(Sex.FEMALE))
                .filter(employee -> employee.getAgeOfEmployee() >= 30)
                .filter(employee -> employee.getAgeOfEmployee() <= 40)
                .collect(Collectors
                        .toMap(employee -> employee.getDateOfBirthday().getMonth(), employee -> employee)));
        System.out.println();

    }
}
