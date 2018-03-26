package com.playtika.homework.com.homework9;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

public class Employee {

    private String firstName;
    private String secondName;
    private String fathersName;
    private LocalDate dateOfBirthday;
    private long inn;
    private Sex sex;
    private LocalDate startWorkerDate;
    private LocalDate endWorkerDate = null;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setStartWorkerDate(LocalDate startWorkerDate) {
        this.startWorkerDate = startWorkerDate;
    }

    public void setEndWorkerDate(LocalDate endWorkerDate) {
        this.endWorkerDate = endWorkerDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public long getInn() {
        return inn;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getStartWorkerDate() {
        return startWorkerDate;
    }

    public LocalDate getEndWorkerDate() {
        return endWorkerDate;
    }

    public double getSalary() {
        return salary;
    }

    public int getExpirience(){
        if(endWorkerDate == null)
            endWorkerDate = now();
        return Period.between(getStartWorkerDate(), getEndWorkerDate()).getYears();
    }
}
