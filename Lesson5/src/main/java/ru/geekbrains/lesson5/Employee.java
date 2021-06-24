package ru.geekbrains.lesson5;

public class Employee {
    String name;
    String duties;
    String email;
    int phone;
    float salary;
    int age;



   public Employee(String name, String duties, String email, int phone, float salary, int age) {

        this.name = name;
        this.duties = duties;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo(String name, String duties, String email, int phone, float salary, int age) {
        System.out.printf("Employee: name - %s, duties - %s, email - %s, phone = %d, salary - %f, age - %d", this.name, this.duties, this.email, this.phone, this.salary, this.age);

//        Employee[] empArr = new Employee[5];
//        empArr[0] = new Employee("John", "Manager", "john@mail.com", 12345, 10000f, 25);
//        empArr[1] = new Employee("Jim", "Builder", "jim@mail.com", 67890, 50000f, 28);
//        empArr[2] = new Employee("Ivan", "Driver", "ivan@mail.com", 13579, 37000f, 69);
//        empArr[3] = new Employee("Maria", "Cook", "maria@mail.com", 24680, 37000f, 48);
//        empArr[4] = new Employee("Olga", "Team Lead", "olga@mail.com", 14679, 103000f, 30);

    }
}


//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
//        30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.