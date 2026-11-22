package HomeWorks2;

public class homework6 {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        //ancnum e bolor tveri vrayov
        for (int i = 0; i < numbers.length; i++) {

            //stugum ardyoq indexy zuyg e: % - bajanman mnacord
            // isq i % 2 == 1 ardyoq indexy kent e
           if (i % 2 == 0 ){
               System.out.println(numbers[i]);
           }
        }
    }
}
