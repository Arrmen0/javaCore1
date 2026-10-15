package homework1;

public class HomeWork4 {

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int t = 1; t <=6 - i; t++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
