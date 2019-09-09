import java.util.Random;
import java.util.Scanner;

public class MyHomeWork_3 {
    //exercise
    public static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        //раскомментировать для игры №1
        //guessNumber();


        //раскомментировать для игры №1
        //guess2();

    }
    //exercize_1
    public static void guessNumber () {
        System.out.println("Угадай число от 0 до 9");
        Random rand = new Random();
        int guessNumb = rand.nextInt(10);
        int attempt = 3;
        while(true) {
            while (attempt > 0) {
                int x = sc.nextInt();
                if (x == guessNumb) {
                    System.out.println("Вы выйграли!");
                    System.out.println("do you want to play some more?");
                    System.out.println("1 - yes, 0 - no");
                    int answer = sc.nextInt();
                    if (answer == 1) {
                        attempt = 3;
                        guessNumb = rand.nextInt(10);
                        System.out.println("Угадай число от 0 до 9");
                    }else if (answer == 0) {
                        System.out.println("good bye");
                        break;
                    }
                }else if (x > guessNumb) {
                    System.out.println("guessed numb lower than " + x);
                    attempt--;
                    System.out.println("you have " + attempt + " attempt");
                }else if (x < guessNumb) {
                    System.out.println("guessed numb bigger than " + x);
                    attempt--;
                    System.out.println("you have " + attempt + " attempt");
                }
            }if (attempt <= 0) {
                System.out.println("do you want to play some more?");
                System.out.println("1 - yes, 0 - no");
                int answer = sc.nextInt();
                if (answer == 1) {
                    attempt = 3;
                    guessNumb = rand.nextInt(10);
                    System.out.println("Угадай число от 0 до 9");
                }else if (answer == 0) {
                    System.out.println("good bye");
                    break;
                }else if (answer != 1 || answer != 0) {
                    System.out.println("incorrect number");
                }
            }
        }
    }
    //exercize_2
    public static void guess2 () {
        System.out.println("\"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\", \"broccoli\", \"carrot\",\n" +
                "\"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\", \"nut\", \"olive\", \"pea\",\n" +
                "\"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\"");

        //создаем массив слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random randIndex = new Random();

        //генерируем рандомное слово
        String guesWord = words[randIndex.nextInt(words.length)];

        //подсказка
        char[] hint = {'#','#','#','#','#','#','#','#','#','#','#','#'};
        int hintIndex = 0;
        //количество попыток
        int attempt = guesWord.length();

        while(true) {
            System.out.println("Угадай слово");
            while (attempt > 0) {
                String userAnswer = sc.next().toLowerCase();
                if (userAnswer.equals(guesWord)) {                          //сравниваем слова
                    System.out.println("Вы выйграли!");
                    System.out.println("do you want to play some more?");
                    System.out.println("1 - yes, 0 - no");
                    int answer = sc.nextInt();
                    if (answer == 1) {                                      //начинаем новую игру
                        guesWord = words[randIndex.nextInt(words.length)];
                        attempt = guesWord.length();
                        System.out.println("Угадай слово по новой");
                        for (int i = 0; i < hint.length; i++) {
                            hint[i] = '#';
                        }
                        hintIndex = 0;
                    }else if (answer == 0) {
                        System.out.println("good bye");
                        break;
                    }
                }else {                                                 //если проверка не прошла, выводим подсказку
                    attempt--;
                    System.out.println("you have " + attempt + " attempt");
                    hint[hintIndex] = guesWord.charAt(hintIndex);
                    hintIndex++;
                    for (char temp : hint) {
                        System.out.print(temp + ",");
                    }
                    System.out.println();
                }
            }
            if (attempt <= 0) {                                         //проверяем количество попыток
                attempt = guesWord.length();
                hintIndex = 0;
                System.out.println("do you want to play some more?");
                System.out.println("1 - yes, 0 - no");
                int answer = sc.nextInt();
                if (answer == 1) {
                    guesWord = words[randIndex.nextInt(words.length)];  //начинаем новую игру
                    System.out.println("Угадай слово по новой");
                    for (int i = 0; i < hint.length; i++) {
                        hint[i] = '#';
                    }
                }else if (answer == 0) {                                //выходим из игры
                    System.out.println("good bye");
                    break;
                }else if (answer != 1 || answer != 0) {
                    System.out.println("incorrect number");
                }
            }
        }
    }
}
//    Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


//        * Создать массив из слов
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//        Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно можно пользоваться:
//        String str = "apple";
//        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово.
//        Используем только маленькие буквы.
