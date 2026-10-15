package homework1;

public class HomeWork5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                    System.out.print(" ");
                }
            for (int t = 1; t <= i; t++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
        }
            for (int t = 0; t < i; t++) {
                System.out.print("* ");
            }
            System.out.println();

            }

    }

}
