package HomeWorks1;

public class homework4 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <=6 ; i++) {
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
