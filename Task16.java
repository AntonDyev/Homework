//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

//Может выдать 0, если элементы МЕЖДУ макс и мин отсутствуют!!!

public class Task16 {
    public static void main(String[] args) {
        int index_max = 0;
        int index_min = 0;
        int max;

        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);

            System.out.println(arr[i]);
    }
        int maxElem = 0;
        int maxVal = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > maxVal)
            {
                maxVal = arr[i];
                maxElem = i;
            }
        }
        int minElem = 0;
        int minVal = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < minVal)
            {
                minVal = arr[i];
                minElem = i;
            }
        }

        int sum = 0;

        if (minElem < maxElem) {
            for (int i = minElem+1; i < maxElem; i++) {
                sum += arr[i];
            }
        }
        else {
            for (int i = maxElem+1; i < minElem; i++) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма чисел между максимальным и минимальным : " + sum);


    }
}
