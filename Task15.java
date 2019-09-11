//создат массив, заполнить его случайными элементами, распечатать, перевернуть,
//и снова распечатать(припереворачивании нежелательно создавать ещё одинмассив)

import java.util.Scanner;

public class Task15 {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Введите длинну массива");
            int n=sc.nextInt();

            int array [] = new int[n];
            for (int index = 0; index < n; index++){
                array[index] = (int) (Math.random() * 10);
                System.out.println(array[index]);
            }
            for( n -= 1; n >= 0; n--){
                System.out.println("<--"+array[n]);
            }
        }
    }