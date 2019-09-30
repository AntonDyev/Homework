//Имеется текст. Следует составить для него частотный словарь.

import java.util.*;

public class Task32 {

    public static void main(String[] args) {

        String text = "Раз, два, три три два раз три раз, пять. Один? Нет, два-два.";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.toLowerCase().trim().split("[[,;:.!?\\]\\s]]+");
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);
        for (String s : wordList) {
            System.out.print(s + " ");
        }
        System.out.println("\nЧастотный словарь");

        wordsRep(wordList, map);

        for (Map.Entry<String, Integer> p : map.entrySet()) {
            String key = p.getKey();
            Integer value = p.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void wordsRep(List<String> list, Map<String, Integer> map) {
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    count++;
                }
                map.put(list.get(i), count);
            }
        }
    }
}
