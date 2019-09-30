public class Screen extends HomeTech implements Tech {


    public Screen(String name, Brand brand, boolean on) {
        super(name, brand, on);
    }

    public  String toString() {
        return "Устройство " + name + ", Брэнд " + brand + ", Включен?  " +
                on ;
    }
}
