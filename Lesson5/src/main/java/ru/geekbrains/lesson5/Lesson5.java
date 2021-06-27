package ru.geekbrains.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employees = {
        new Employee("John", "Manager", "john@mail.com", 12345, 10000f, 25);
        new Employee("Jim", "Builder", "jim@mail.com", 67890, 50000f, 28);
        new Employee("Ivan", "Driver", "ivan@mail.com", 13579, 37000f, 69);
        new Employee("Maria", "Cook", "maria@mail.com", 24680, 37000f, 48);
        new Employee("Olga", "Team Lead", "olga@mail.com", 14679, 103000f, 30);
        };
    }

    for (int i = 0; i < 5; i++){
        if (Employee.getAge() > 40) Employee.printInfo();
        }
    }
}
