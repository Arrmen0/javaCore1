package homework3;

import jdk.swing.interop.SwingInterOpUtils;

public class CharArrayUtil {

    public static void main(String[] args) {

        //Խնդիր 1 — Տպել բոլոր սիմվոլները
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        for (int i = 0; i < chars.length; i++) {
            System.out.print("" + chars[i]);
        }

        //Խնդիր 2 — Հաշվել սիմվոլների քանակը
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println();
        System.out.println("Characters count: " + count);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count1++;
            }
        }
        System.out.println("Character 'a' count: " + count1);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'A' ||
                    chars[i] == 'e' || chars[i] == 'E' ||
                    chars[i] == 'i' || chars[i] == 'I' ||
                    chars[i] == 'o' || chars[i] == 'O' ||
                    chars[i] == 'u' || chars[i] == 'U') {

                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);

        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը
        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z' ||
                    chars[i] >= 'A' && chars[i] <= 'Z') &&
                    chars[i] != 'a' && chars[i] != 'e' &&
                    chars[i] != 'i' && chars[i] != 'o' &&
                    chars[i] != 'u' || chars[i] != 'A' &&
                    chars[i] == 'E' || chars[i] == 'I' &&
                    chars[i] == 'O' || chars[i] == 'U') {

                consonantsCount++;
            }
        }

        System.out.println("Consonants count: " + consonantsCount);

        //Խնդիր 6 — Հաշվել բացատների քանակը

        int count2 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count2++;
            }
        }
        System.out.println("Spaces count:" + count2);

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print("" + chars[i]);
        }
        System.out.println();

        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը

        char[] upper =  {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        char[] lower = upper.clone();
        for (int i = 0; i < upper.length; i++) {
            if (upper[i] >= 'a' && upper[i] <= 'z') {
                upper[i] = (char) (upper[i] - 32);
            }
        }
        System.out.print("Uppercase: ");
        for (int i = 0; i < upper.length; i++) {
            System.out.print(upper[i]);
        }
        System.out.println();

        for (int i = 0; i < lower.length; i++) {
            if (lower[i] >= 'A' && lower[i] <= 'Z') {
                lower[i] = (char) (lower[i] + 32);
            }
        }
        System.out.print("Lowercase: ");
        for (int i = 0; i < lower.length; i++) {
            System.out.print(lower[i]);
        }
        System.out.println();

        //Խնդիր 9 — Փոխարինել տրված սիմվոլը

        char[] text =  {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < text.length ; i++) {
            if (text[i] == oldChar) {
                text[i] = newChar;
            }
        }
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }

        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
        boolean isPalindrome = true;
        for (int i = 0; i < chars1.length / 2; i++) {
            if (chars1[i] != chars1[chars1.length - 1 - i]) {
                isPalindrome = false;

            }
        }
        System.out.println();
        System.out.println("Is palindrome: " + isPalindrome);

        //Լրացուցիչ առաջադրանքներ (Bonus)

        char[] chars2 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int index = - 1;
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First index: " + index);

        //Bonus 2 — Համեմատել երկու char զանգված

        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean same = true;

        if (first.length != second.length) {
            same = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal: " + same);
            }
        }





