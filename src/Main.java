public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
            System.out.println();

        System.out.println("Задание 2");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.println(a);
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int b = 0; b < 17; b = b + 2){
            System.out.println(b);
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int c = 10; c != -11; c = c -1) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Задание 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " является високосным");
        }
        System.out.println();

        System.out.println("Задание 6");
        for (int f = 7; f < 100; f = f + 7) {
            System.out.println(f);
        }
        System.out.println();

        System.out.println("Задание 7");
        for (int g = 1; g < 513; g = g * 2){
            System.out.println(g);
        }
        System.out.println();

        System.out.println("Задание 8");
        int cash = 29000;
        int total = 0;
        for (int month = 1; month < 13; month = month + 1){
            total = total + cash;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("Задание 9");
        int salary = 29000;
        int savings = 29000;
        for (int monthIndex = 1; monthIndex < 13; monthIndex = monthIndex + 1){
            savings = savings + savings/100;
            savings = savings + salary;
            System.out.println("Месяц " + monthIndex + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();

        System.out.println("Задание 10");
        for (int x = 1; x < 11; x = x + 1){
            System.out.println("2*" + x + "=" + 2*x);
        }
    }
}