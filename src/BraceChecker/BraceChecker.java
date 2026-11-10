package BraceChecker;

import  java.util.Stack;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }
    public void check(){

        Stack<Character> stack = new Stack<>();
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i <text.length() ; i++) {
            char ch = text.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {

                stack.push(ch);
                indexes.push(i);

            } else if (ch == '}' || ch == ']' || ch == ')') {

                if (stack.isEmpty()) {

                    System.out.println("Error: unexpected " + ch + " at " + i);
                    return;

                } else {

                    char last = stack.peek();

                    if (last == '{' && ch == '}' ||
                            last == '[' && ch == ']' ||
                            last == '(' && ch == ')') {

                        stack.pop();
                        indexes.pop();
                    } else {

                        System.out.println("Error: opend" + last + " but closed " + ch + " at " + i);
                        return;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {

            char last = stack.pop();
            int index = indexes.pop();

            System.out.println("Error: opened " + last + " but not closed at " + index);
        }else {
            System.out.println("No errors");

        }
    }
}




