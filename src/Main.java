public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + 15_000;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = i + 1; i > 1; ) {
            i--;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 17_000_000;
        int birthOnThousand = 17;
        int deathOnThousand = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + (birthOnThousand - deathOnThousand) * population / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 0;
        int salary = 15_000;
        for (int i = 1; total < 12_000_000; i++) {
            total = total * 7 / 100 + total;
            total = total + salary;
            System.out.println("Месяц " + i + ",сумма вклада равна " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 0;
        int salary = 15_000;
        for (int i = 1; total < 12_000_000; i++) {
            total = total * 7 / 100 + total;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ",сумма вклада равна " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 0;
        int salary = 15_000;
        int i = 1;
        while (i < 108) {
            i++;
            total = total * 7 / 100 + total;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ",сумма вклада равна " + total);
            }
        }
    }

        public static void task7 () {
            System.out.println("Задача 7");
            int i = 5;
            int day = 1;
            while (day<31) {
                day++;
                if (day%7==5)
                    System.out.println("Сегодня пятница,"+day+"-е число. Необходимо подготовить отчет");
            }
        }

        public static void task8 () {
            System.out.println("Задача 8");
            int year = 2022;
            for(int i = 0;i<year+100;i++){
                if (i % 79 == 0 && year - 200 < i) {
                    System.out.println(i);
                }
            }
        }
}