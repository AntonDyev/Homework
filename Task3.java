//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд.
//по аналогии с примером выше.

public class Task3 {
    public static void main(String[] args) {

        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int days = d % 24;
        int w = (d - days) / 7;

        System.out.println("A)" + m + " минут " + sec + " секунд");
        System.out.println("B)" + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("C)" + d + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
        System.out.println("D)" + w + " недель " + days + " дней " + hour + " часов " + min + " минут " + sec + " секунд");

    }
}
