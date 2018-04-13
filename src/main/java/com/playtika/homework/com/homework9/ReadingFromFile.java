package com.playtika.homework.com.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFromFile {

    public static List<Employee> listOfEmployee = new ArrayList<>();
    public static List<String> listOfString = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Path getPath() throws IOException {
//        System.out.println("Введите путь к файлу: ");
//        String line = reader.readLine();
        String line = "src/main/java/com/playtika/homework/com/homework9/employees.txt";
        System.out.println("Путь к файлу: " + line);
        Path path = Paths.get(line);
        return path.toAbsolutePath();
    }

    public List<String> readFromFile() throws IOException {
        listOfString = Files.readAllLines(getPath());
        return listOfString;
    }

    private Employee createEmployee(String line) throws DateTimeParseException {
        String[] arr = line.split(";");
        Employee employee = new Employee();
        employee.setFirstName(arr[0]);
        employee.setSecondName(arr[1]);
        employee.setFathersName(arr[2]);
        employee.setDateOfBirthday(LocalDate.parse(arr[3]));
        employee.setInn(Long.valueOf(arr[4]));
        employee.setSex(Sex.valueOf(arr[5]));
        employee.setStartWorkerDate(LocalDate.parse(arr[6]));
        if (!arr[7].equals("null")) {
            employee.setEndWorkerDate(LocalDate.parse(arr[7]));
        }
        employee.setSalary(Double.parseDouble(arr[8]));

        return employee;

    }

    public List<Employee> createListOfEmployees(List<String> list) {

        try {

            for (int i = 0; i < list.size(); i++) {
                listOfEmployee.add(createEmployee(list.get(i)));
            }
        } catch (DateTimeParseException e) {
            System.out.println("Неправильный формат даты");
        } finally {
            return listOfEmployee;
        }
    }

}
