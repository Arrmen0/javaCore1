package Examples;

public class Example21 {

    public static void main(String[] args) {
        int[] numbers = {12, 5, 28, 7, 19};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum number:" + max);
    }

}
