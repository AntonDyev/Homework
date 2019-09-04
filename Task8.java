//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
import java.math.*;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();

        switch (Math.abs(x) % 10) {
            case 1:
                System.out.println(Math.abs(x) + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(Math.abs(x) + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(Math.abs(x) + " рублей");
                break;
        }

    }
}
