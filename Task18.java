//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.

// Других знаков, вроде, нету, я натыкал сам :)

public class Task18 {
    public static void main(String[] args) {
        String str = " Строковый литерал - это последовательность символов, заключенных в двойные кавычки. А; тут: еще; парочка: знаков. ";

        int n = 0;
        char symbol;

        for(int i = 0; i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == '-' || symbol == ':' || symbol == ';') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");
    }
}
