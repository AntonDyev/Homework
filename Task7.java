//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.

import java.math.BigDecimal;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a прямоугольника: ");
        int a = sc.nextInt();
        System.out.println("Введите сторону b прямоугольника: ");
        int b = sc.nextInt();
        System.out.println("Введите радиус круглой картонки r: ");
        int r = sc.nextInt();

        double d = Math.sqrt(a*a+b*b);

        if (r >= d/2) {
            System.out.println("Прямоугольное отверстие можно закрыть круглой картонкой");
        }else {
            System.out.println("Прямоугольное отверстие нельзя закрыть круглой картонкой");
        }



    }
}
