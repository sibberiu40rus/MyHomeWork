public class HomeWork {
    public static void main(String[] args) {
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64;
        float f = 1.2f;
        double dob = 123.123;
        char ch = 'd';
        boolean tr = true;

        calc(12, 13, 13, 15);

        checkSum(13,1);
        checkSum(131,1);
        checkSum(1,1);

        checkNum(0);
        checkNum(2);
        checkNum(-3);

        System.out.println(checkNegative(3));
        System.out.println(checkNegative(-3));

        printMessage("Даша");

        checkYear(1923);
        checkYear(4);
        checkYear(100);
        checkYear(400);
        checkYear(1600);
    }

    //        Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //        где a, b, c, d – входные параметры этого метода.

    public static void calc(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        System.out.println(result);
    }
    //        Написать метод, принимающий на вход два числа и проверяющий,
    //        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static void checkSum(int firstNum, int secondNum) {
        boolean result = false;
        int sum = firstNum + secondNum;
        if (sum >= 10 && sum <= 20){
            result = true;
        }
        System.out.println(result);
    }
    //        Написать метод, которому в качестве параметра передается целое число,
    //        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //        Замечание: ноль считаем положительным числом.

    public static void checkNum(int num) {
        String positive = "Положительное";
        String negative = "Отрицательное";

        if (num >= 0) {
            System.out.println(num + " - " + positive);
        }else {
            System.out.println(num + " - " + negative);
        }
    }
    //        Написать метод, которому в качестве параметра передается целое число.
    //        Метод должен вернуть true, если число отрицательное.

    public static boolean checkNegative(int num) {
        boolean result = false;
        if (num < 0) {
            result = true;
        }
        return result;
    }
    //        Написать метод, которому в качестве параметра передается строка,
    //        обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void printMessage (String yourName) {
        System.out.println("Привет, " + yourName + "!");
    }

    //        *Написать метод, который определяет, является ли год високосным
    //        , и выводит сообщение в консоль. Каждый 4-й год является високосным,
    //        кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void checkYear (int yourYear) {
        int leapYear = 4;
        int notLeapYear = 100;
        int absLeapYear = 400;
        if ((yourYear % leapYear == 0 && yourYear % notLeapYear != 0) || (yourYear % absLeapYear == 0)) {
            System.out.println(yourYear + " год високосный");
        }else {
            System.out.println(yourYear + " год не високосный");
        }
    }

}

