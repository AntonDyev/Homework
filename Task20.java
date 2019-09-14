//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.


import java.lang.*;

public class Task20 {
    public static void main(String[] args) {
        String str = "Блог просто плов, Антон просто весельчак, одиночество довод ";
        String[] slova  = str.split("[\\s[,;.:!]]+");
        String bykvi ="";
        System.out.println(str);
        for (int i = 0; i < slova.length; i++) {
            bykvi += slova[i].substring(slova[i].length()-1 );
        }

        System.out.println("Последние буквы: " +bykvi);
    }
}