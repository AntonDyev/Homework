//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Task11 {

    public static void main(String[] args) {

        int n = (int)(Math.random()*1000);
        System.out.println(n);
        int i;

        boolean isComposite = false;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число не простое");
        } else {
            System.out.println("число  простое ");
        }
    }
}
