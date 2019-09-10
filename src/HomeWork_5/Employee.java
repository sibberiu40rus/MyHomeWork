package HomeWork_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО - " + name + "\nДолжность - " + position + "\nEmail - " + email +
                "\nТел.номер - " + phoneNumber + "\nЗарплата - " + salary + "\nВозраст - " + age);
    }

    public String toString (Employee[] emp) {
        for ()
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//Конструктор класса должен заполнять эти поля при создании объекта;
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//Создать массив из 5 сотрудников; С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//Показать знание инкапсуляции как сокрытия.