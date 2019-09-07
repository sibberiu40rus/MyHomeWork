public class MyHomeWork_2 {
    public static void main(String[] args) {
        //ex1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        int[] arr_1 = {0, 1, 1, 0, 1, 0, 1, 1, 0, 0};
        changeNum(arr_1);

        // ex2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr_2 = new int[8];
        System.out.println();
        printArr(arr_2);

        //ex3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        multiplyArr(arr_3);

        //ex4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arr_4 = new int[5][5];
        printArr_2(arr_4);

        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr_5 = {1, 5, 6, 2, 11, 4, 6, 2, 4, 8, 9, 1};
        findMinMax(arr_5);

        int[] arr_6 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr_6_1 = {2, 8, 2, 1, 2, 2, 2, 1};
        comparisonHalf(arr_6_1);
        comparisonHalf(arr_6);

    }




    // ex1       С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    //ex2
    public static void printArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }
    }

    //ex3
    public static void multiplyArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }
    }
    //ex4
     public static void printArr_2 (int [][] arr) {
         System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){ ;
                if (((i+j) == arr.length - 1) || i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     }
     //ex5
    public static void findMinMax (int[] arr) {
        System.out.println();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            else if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("min - " + min + " " + "max - " + max);
    }
    // ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    public static void comparisonHalf (int[] arr) {
        int arrSum = 0;
        int halfArrSum = 0;
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arrSum -= arr[i];
            halfArrSum += arr[i];
            if (arrSum == halfArrSum) {
                result = true;
                break;
            }
        }
        System.out.println(result + ", " + arrSum +", " + halfArrSum);
    }
}




