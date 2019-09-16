//Задание 24
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Task24 {

        private int second;
        private long minute;
        private int hour;

        public Task24(int second, int hour){
            this.second = second;
            this.hour = hour;
        }

        public Task24( int second, long minute) {
            this.second = second;
            this.minute = minute;
        }

        public int seconds() {
            second = second + hour * 60 * 60;
            second = second + (int)minute * 60;
            System.out.println("Общее количество секунд объекта  " + second);
            return second;
        }

        public void compare(Task24 time2){
            Task24 time1 = new Task24(this.second, this.hour);
            int sec1 = time1.seconds();
            int sec2 = time2.seconds();

            if(sec1 > sec2){
                System.out.printf("В первом объекте больше секунд");
            }else {
                System.out.printf("Во втором объекте больше секунд");
            }
        }


        public static void main(String[] args) { //add comment

            Task24 time1 = new Task24(1, 23);
            Task24 time2 = new Task24(423, 1);
            time1.compare(time2);
        }
}

