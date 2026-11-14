package examplebox;

public class DemoBoxWeight {

    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1i unecacy havasar e " + vol);
        System.out.println("amboxj mybox2 havasar e " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("mybox2i unecacy havasar e " + vol);
        System.out.println("ambox mybox2 havasar e " + mybox2.weight);
    }
}
