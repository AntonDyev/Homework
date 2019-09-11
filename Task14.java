//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

import java.util.Random;
import java.util.Scanner;

public class Task14 {

    private static int MAX = 100;

    public static void main(String[] args) {

        System.out.println("Введите n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int index = 0; index < n; index++) {
            array[index] = (int) (MAX * Math.random());
        }
        System.out.println("все числа");
        for(int index = 0; index < n; index++) {
            System.out.println(array[index]);
        }

        int max = 0;
        int min = MAX;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
        System.out.println("Индекс максимального числа число = " + maxIndex);
        System.out.println("Индекс минимального числа число = " + minIndex);
    }
}