package lesson4;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 9, 3, 0};

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

        System.out.println(numbers[numbers.length / 2]);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max=" + max);
    }
}
