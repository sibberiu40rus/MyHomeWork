import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MyHomeWork_4 {
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;

    public static final char DOT_EMPTY = '%';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j ++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        }while (!isCellValid (x,y));
        map[y][x] = DOT_X;
    }

    public static Random rand = new Random();
    public static void aiTurn() {
        int x,y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while (!isCellValid(x,y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin( char playerSymbol) {
        boolean result = false;
        int sum = 0;
        //check column
        for (int i = 0; i < SIZE; i++) {
            sum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == playerSymbol){
                    sum++;
                }
            }
            if (sum == SIZE) {
                result = true;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            sum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == playerSymbol) {
                    sum++;
                }
            }if (sum == SIZE) {
                result = true;
            }
        }

        //check first diagonal
        int firstDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == playerSymbol) {
                    firstDiagonal++;
                }
            }
        }

        //check second diagonal
        int secondDiagonal = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE && j >= 0; i++, j--) {
            if (map[i][j] == playerSymbol) {
                secondDiagonal++;
            }
        }
        if (firstDiagonal == SIZE || secondDiagonal == SIZE) {
            result = true;
        }
        return result;
    }

    private static boolean isMapFull() {
        boolean result = true;

        for (int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }

        return result;
    }
}


