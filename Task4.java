// Определить число, полученное выписыванием в обратном порядке цифр
//любого 4-х значного натурального числа n.

public class Task4 {
    public static void main(String[] args) {

        int number = 8421;
        int result = 0;

        result = (result * 10) + (number % 10);
        number = number / 10;
        result = (result * 10) + (number % 10);
        number = number / 10;
        result = (result * 10) + (number % 10);
        number = number / 10;
        result = (result * 10) + (number % 10);
        number = number / 10;

        System.out.println( "Число, полученное выписыванием в обратном порядке цифр = " + result);

    }
}
