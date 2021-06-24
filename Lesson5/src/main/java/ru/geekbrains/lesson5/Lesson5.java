package ru.geekbrains.lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "manager", "john@email.com", 12345,100000.0f, 20);
        emp1.name = "John";
        emp1.duties = "manager";
        emp1.email = "john@email.com";
        emp1.phone = 12345;
        emp1.salary = 100000.0f;
        emp1.age = 20;

    }
}
