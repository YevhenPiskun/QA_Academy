package com.playtika.homework.com.homework9;

import java.util.List;

public class IndexingEmployeesByInn implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Индексация сотрудников по ИНН: ");
        System.out.println(list.stream()
        .map(employee -> employee.getInn()));
        System.out.println();
    }
}
