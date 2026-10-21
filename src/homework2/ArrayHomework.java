package homework2;

public class ArrayHomework {

    public static void main(String[] args) {
        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of " + n + ": " + count);

        //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = 0; i < numbers2.length / 2; i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};

        int count1 = 0;

        for (int i = 0; i < numbers3.length; i++) {

            boolean repeated = false;

            for (int j = 0; j < i; j++) {

                if (numbers3[i] == numbers3[j]) {
                    repeated = true;
                    break;
                }
            }

            if (repeated == true) {
                for (int j = i + 1; j < numbers3.length; j++) {
                    if (numbers3[i] == numbers3[j]) {
                        count1++;
                        break;
                    }
                }
            }
        }
        System.out.println("Repeated numbers count:" + count1);


        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

         int count2 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' ||
                    chars[i] == 'է' || chars[i] == 'ը' ||
                chars[i] == 'ի' || chars[i] == 'ո' ||
                    chars[i] == 'օ') {
                count2++;
            }
        }

        System.out.println("Vowels count:" + count2 );

        //Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
        int[] numbers4 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};

        int max = Integer.MIN_VALUE;

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers4.length; i++) {

            if (numbers4[i] > max) {
                secondMax = max;
                max = numbers4[i];
            } else if (numbers4[i] < max && numbers4[i] > secondMax) {
                secondMax = numbers4[i];
            }
        }
        System.out.println("Second maximum: " + secondMax);

        }
    }










