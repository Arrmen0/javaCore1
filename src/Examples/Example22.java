package Examples;

public class Example22 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp;
            temp = numbers[i];
            numbers[i] = numbers[numbers.length -1 -i];
            numbers[numbers.length -1 - i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
