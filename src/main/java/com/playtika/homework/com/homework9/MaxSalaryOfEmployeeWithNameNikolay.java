package com.playtika.homework.com.homework9;

import java.util.List;

public class MaxSalaryOfEmployeeWithNameNikolay implements Reportable {
    @Override
    public void report(List<Employee> list) {
        System.out.println("Максимальная зарплата у сотрудника с именем Николай: ");
        System.out.println(list.stream()
                .filter(employee -> "Николай".equals(employee.getSecondName()))
                .mapToDouble(Employee::getSalary)
                .max());
        System.out.println();
    }
}