package HomeWorks1;

public class homework3 {

    public static void main(String[] args) {

        // sum popoxakanin talis enq arjeq 0
        int sum = 0;

        //int i = 1 cikly sksum enq 1 tvic
        for (int i = 1; i <=5; i++) {
            //ays paymany stugumm e tivy zuyg e te voch
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

