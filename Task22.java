//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task22
{
    public static void main(String[] args) {

        String str = "0x7FAF , a0X141D1 , qweasd342fees234fgewew32";
        Pattern reg = Pattern.compile("0[xX]([0-9A-Fa-f0-9A-Fa-f])*");
        Matcher matcher = reg.matcher(str);
        while (matcher.find()){
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}