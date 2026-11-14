package lesson6;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input student name:");
        String name = scanner.nextLine();

        System.out.println("Please input student surname");
        String surname = scanner.nextLine();

        System.out.println("Please input student's phone number");
        String phone = scanner.nextLine();

        System.out.println("Please ipnut student's course name ");
        String course = scanner.nextLine();

        Student student = new Student(name, surname, phone, course);

        System.out.println("Student registred!");
        System.out.println(student);

    }

}
