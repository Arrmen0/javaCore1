package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeStorage employeeStorage = new EmployeeStorage();
        while (true){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
            System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");

            System.out.println("input:" );

            if (!scanner.hasNextInt()){
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0:
                    System.out.println("Program finished: ");
                    return;
                case 1:
                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();

                    System.out.println("Please input employee salary:");
                    int salary = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();

                    System.out.println("Please input employee position:");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);

                    employeeStorage.addEmployee(employee);
                    break;

                case 2:
                    employeeStorage.printAll();
                    break;

                case 3:
                    System.out.println("Please input ID:");
                    String searchID = scanner.nextLine();
                    Employee result = employeeStorage.searchById(searchID);

                    if (result != null) {
                        System.out.println("Employee found:");
                        System.out.println(result);
                    } else {
                        System.out.println("Employee with ID " + searchID + "not found:");
                    }
                    break;


                case 4:
                    System.out.println("Please input company name:");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompany(companyName);

                    break;

                case 5:
                    System.out.println("Please input minimum salary:");
                    int minSalary = scanner.nextInt();
                    scanner.nextLine();

                    employeeStorage.searchBYMinSalary(minSalary);

                    break;

                case 6:
                    System.out.println("Please input employee ID:");
                    String deleteID = scanner.nextLine();

                    employeeStorage.deleteEmployeeById(deleteID);
                    break;

                default:
                    System.out.println("Invalid command! Please try again");

                    break;
            }
        }
    }
}
