//Имеется следующая задача: надо получить ряд случайных чисел, и посчитать
//произведение от них. Ввод чисел прекращается, если очередным числом
// будет ноль.

public class Task9 {

    public static void main(String[] args) {

        int comp =1;
        int x = (int)(Math.random()*20);
        while(x != 0) {

            System.out.print("* " + x);
            comp *= x;

            x= (int)(Math.random()*20);
            System.out.println(" = "+comp);
        }



    }
}