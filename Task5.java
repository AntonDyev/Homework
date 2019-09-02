//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();

        for (int i = 0; i<4; i++){
            int number1 = number%10;
            number /=10;
            int number2 = number % 10;
            number /=10;
            int number3 = number % 10;
            number /=10;
            if (number1 != number2 & number1 != number3 & number1 != number & number2 != number3 & number2 != number & number3 != number){
                System.out.println("Цифры различны");
                break;
            }else {
                System.out.println("Есть повторяющиеся цифры");
                break;
            }
        }
    }

}

