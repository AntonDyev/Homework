//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        System.out.println("Введите n ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int array [] = new int[n];

        for(int index = 0; index < n; index++){
            array[index] = (int)(Math.random()*n);
        }
        System.out.println("все числа");
        for(int index = 0; index < n; index++) {
            System.out.println(array[index]);
        }
        int max = 0;
        for(int index = 0;index < n-1; index++) {
            if (array[max] < array[index+1]){
                max = index+1;
            }
        }
        System.out.println("Наибольшее число ="+array[max]);
    }
}


