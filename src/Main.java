public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Итерация цикла " + i);
            }
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 8");
        int amount = 29_000;
        int summa = 0;
        for (int month = 1; month <= 12; month++) {
            summa += amount;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей");
        }

        System.out.println("Задача 9");
        summa = 0;
        double percent = 1D / 100;
        for (int month = 1; month <= 12; month++) {
            summa += amount;
            summa = (int) (summa * (1 + percent));
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summa + " рублей");
        }

        System.out.println("Задача 10");
        for (int multiplayer = 1; multiplayer <= 10; multiplayer++) {
            System.out.printf("%d x %d = %d%n", 2, multiplayer, 2 * multiplayer);
        }
    }
}