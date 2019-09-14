//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class Task19 {
    public static void main(String[] args) {

        int i;

        String n = "Just bla-bla bla bla  bla ; bla ";

        String [] mass = n.split("[a-zA-Z]+");
        for( i = 0; i < mass.length-1; i++) {
        }

        System.out.println("Колличество слов в строке  " + i);
    }
    }

