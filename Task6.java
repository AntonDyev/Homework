//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        if ((n / 100) > 0 & (n / 100) < 10) {
            System.out.println("Число является трехзначным");
        } else {
                System.out.println("Число не является трехначным");
            }

        if (n % 10 == 7) {
            System.out.println("Последняя цифра 7");
        } else {
            System.out.println("Число заканчивается не на 7");
        }

        if (n % 2 ==0) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        }

        sc.close();

    }
}

