package com.playtika.homework.com.homework9;

import java.util.List;

public class StreamMethods {

    public void getCountOfFemale(List<Employee> list) {
        System.out.println("Количество женщин: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex() == Sex.FEMALE)
                .count());
    }

    public void getCountOfMenWithSalaryMoreThen10000(List<Employee> list){
        System.out.println("Количество мужчин с зарплатой более 10000: ");
        System.out.println(list.stream()
                .filter(employee -> employee.getSex() == Sex.MALE)
                .filter(employee -> employee.getSalary() > 10000)
                .count());
    }

}
