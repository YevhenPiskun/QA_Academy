package com.playtika.homework.com.homework9;

import java.util.List;
import java.util.stream.Collectors;

public class IndexingEmployeesByInn implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Индексация сотрудников по ИНН: ");
        System.out.println(list.stream()
        .collect(Collectors.toMap(Employee::getInn, employee -> employee)));
        System.out.println();
    }
}
