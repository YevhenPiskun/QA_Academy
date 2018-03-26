package com.playtika.homework.com.homework9;

import java.time.LocalDate;
import java.util.List;

public class CountOfFiredEmployeesInLastYear implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Число уволенных за прошлый год: ");
        System.out.println(list.stream()
        .filter(employee -> employee.getEndWorkerDate().getYear() == LocalDate.now().getYear() - 1)
        .count());
    }
}
