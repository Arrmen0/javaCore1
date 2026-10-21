package HomeWork;

public class ArraySortingHomework {

    public static void main(String[] args) {

        //Խնդիր 1 — Սորտավորել զանգվածը փոքրից մեծ (Ascending Order)
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            //Խնդիր 2 — Սորտավորել զանգվածը մեծից փոքր
        int[] numbers1 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i + 1; j < numbers1.length ; j++) {
                if (numbers1[i] < numbers1[j]) {
                    int temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }
        }
        System.out.println();

        for (int k = 0; k < numbers1.length; k++) {
            System.out.print(numbers1[k] + " ");
        }

        }
    }

