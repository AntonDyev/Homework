//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class Task21 {
    public static void main(String[] args) {

        String one = "one";
        String two = "two";
        String three = "three";
        int start, end, result;


        start = (int) System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            one +="oneoneone";
        }

        end = (int) System.currentTimeMillis();
        result = end - start;
        System.out.println("Понадобилось " + result + "мс");

        start = (int) System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++){
            builder = builder.append(two);
        }
        end = (int) System.currentTimeMillis();
        result = end - start;
        System.out.println("Понадобилось " + result + "мс");

        start = (int) System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer ();
        for (int i = 0; i < 10000; i++){
            stringBuffer = stringBuffer.append(three);
        }
        end = (int) System.currentTimeMillis();
        result = end - start;
        System.out.println("Понадобилось " + result + "мс");


    }
}
