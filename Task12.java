//Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        System.out.println("Введите n ");

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for( int i = 1; i <= n; i++){

            int dig = i % 3;
            if(dig == 0){
                sum += i;
            }
            if (i == n){
                System.out.println("Cумма чисел, делящихся на 3="+sum);
            }
        }
    }
}