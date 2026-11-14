package studentportal;

import java.util.Scanner;

public class StudentPortal {

    private static Scanner scanner = new Scanner(System.in);
    private  static StudentPortal studentPortal = new StudentPortal();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for add Student");
            System.out.println("please input 2 for printall Students");
            System.out.println("Please input 3 for search Student");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                addStudent();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("command not found!");
            }
        }
    }

    private static void addStudent() {
        System.out.println("Please input name,surname,phone,course");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");
        Student student = new Student(studentDataArr[0],
                                studentDataArr[1],
                                studentDataArr[2],
                                studentDataArr[3]);


    }
}

