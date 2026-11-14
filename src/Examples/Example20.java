package Examples;

public class Example20 {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 10, 7, 6, 12, 8, 16, 18, 10};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Even numbers:" +count);
    }
    
}
