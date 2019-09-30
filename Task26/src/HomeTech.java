public class HomeTech implements Tech {

    protected String name;
    protected Brand brand;
    protected boolean on;

    public HomeTech(String name, Brand brand, boolean on) {
        this.name = name;
        this.brand = brand;
        this.on = on;
    }


    public void On() {
        on = true;
    }

    public void Off() {

        on = false;
    }

    public String toString() {
        return "Устройство " + name + ", Брэнд " + brand +", Включен?  " +
                on;
    }
}


