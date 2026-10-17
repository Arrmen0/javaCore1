package homeworks;

import lesson4.Average;

public class ArrayUtil {

    public static void main(String[] args) {
        //Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        //Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println();
        System.out.println("First element: " + numbers[0]);

        //Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        //Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);

        //Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = (numbers[0]);
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println("Minimum number:" + min);

                //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
                if (numbers.length <= 2) {
                    System.out.println("Cant print middle values");
                } else if (numbers.length % 2 != 0) {
                    int middle = numbers.length / 2;
                    System.out.println("Middle elements:" + numbers[middle]);

                    //Խնդիր 7 — Հաշվել զույգ թվերի քանակը
                    int count = 0;
                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j] % 2 == 0) {
                            count++;
                        }
                    }
                    System.out.println("Even numbers count: " + count);

                    //Խնդիր 8 — Հաշվել կենտ թվերի քանակը
                    int oddCount = 0;
                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j] % 2 != 0) {
                            oddCount++;
                        }
                    }
                    System.out.println("Odd numbers conut:" + oddCount);

                    //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
                    int sum = 0;

                    for (int j = 0; j < numbers.length; j++) {
                        sum = sum + numbers[j];
                    }
                    System.out.println("Sum:" + sum);

                    //Խնդիր 10 — Հաշվել միջին թվաբանականը
                    double average = (double) sum / numbers.length;
                    System.out.println("Average:" + average);

                    //Bonus 1 — Գտնել ամենամեծ թիվը
                    int max = numbers[0];

                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j] > max) {
                            max = numbers[j];
                        }
                    }
                    System.out.println("Max" + max);

                    //Bonus 2 — Հաշվել դրական և բացասական թվերը
                    int positiveCount = 0;
                    int negativeCount = 0;
                    int zeroCount  = 0;
                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j] > 0) {
                            positiveCount++;
                        } else if (numbers[j] < 0) {
                            negativeCount++;

                        } else {
                            zeroCount++;
                        }
                    }
                    System.out.println("Positive numbers: " + positiveCount);
                    System.out.println("Negative numbers: " + negativeCount);
                    System.out.println("Zero numbers: " + zeroCount);
                }
                {
                }
            }
        }
    }
}
