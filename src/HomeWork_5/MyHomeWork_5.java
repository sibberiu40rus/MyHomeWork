package HomeWork_5;

public class MyHomeWork_5 {
    public static void main(String[] args) {
        Employee emp = new Employee("Максим","Машинюга","максим@пес","9308409650",70000,77);
        emp.info();

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Максим","Машинюга","максим@пес","9308409650",70000,77);
        empArr[1] = new Employee("Мартин","Машинюга","максим@пес","9308409650",70000,77);
        empArr[2] = new Employee("Максим","Машинюга","максим@пес","9308409650",70000,77);
        empArr[3] = new Employee("Максим","Машинюга","максим@пес","9308409650",70000,77);
        empArr[4] = new Employee("Максим","Машинюга","максим@пес","9308409650",70000,77);

        System.out.println(empArr[1].toString());
    }
}
