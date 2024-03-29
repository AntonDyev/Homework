//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task31
{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (1 + Math.random() * 10));
        }

        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            int next = iterator.next();
            if (min > next){
                min = next;
            }
            if (max < next){
                max = next;
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}