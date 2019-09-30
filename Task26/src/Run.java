public class Run {  public static void main(String[] args) {
    Tech Screen = new Screen("Screen", Brand.BENQ,  false);
    Tech Lamp = new HomeTech("Lamp", Brand.LG, true);
    Tech Phone = new HomeTech("Phone", Brand.SAMSUNG, false);
    System.out.println(Screen);
    System.out.println(Lamp);
    System.out.println(Phone);
}
}
