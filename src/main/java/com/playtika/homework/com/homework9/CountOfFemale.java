package com.playtika.homework.com.homework9;

import java.util.List;

public class CountOfFemale implements Reportable {

    @Override
    public void report(List<Employee> list) {
        System.out.println("Количество женщин: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex() == Sex.FEMALE)
                .count());
        System.out.println();
    }
}
