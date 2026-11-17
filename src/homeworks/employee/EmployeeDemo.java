package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();

        while (true){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for ADD COMPANY");
            System.out.println("Please input 6 for PRINT ALL COMPANIES");
            System.out.println("Please input 7 for SEARCH COMPANY BY ID");
            System.out.println("Please input 8 for PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("Please input 9 for  CHANGE EMPLOYEE COMPANY");
            System.out.println("Please input 10 for PRINT EMPLOYEE COMPANY");
            System.out.println("Please input 11 for SEARCH BY MINIMUM SALARY");
            System.out.println("Please input 12 for DELETE EMPLOYEE");

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

                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();

                    System.out.println("Please input employee ID:");
                    String employeeID = scanner.nextLine();

                    System.out.println("Please input employee salary:");
                    int salary = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Please input employee position:");
                    String companyId = scanner.nextLine();

                    System.out.println("Please input company ID:");
                    String position = scanner.nextLine();

                    Company company = companyStorage.getById(companyId);

                    if (company == null) {
                        System.out.println("Company with ID " + companyId + " not found.");
                        System.out.println("Please add the company first.");
                        break;
                    }

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
                        System.out.println("Employee with ID " + searchID + "not found.");
                    }
                    break;

                case 4:
                    System.out.println("Please input company name:");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompany(companyName);

                    break;

                case 5:
                    System.out.println("Please input company ID:");
                    String newCompanyId = scanner.nextLine();

                    System.out.println("Please input company name:");
                    String newCompanyName = scanner.nextLine();

                    System.out.println("Please input company industry:");
                    String industry = scanner.nextLine();

                    System.out.println("Please input company country:");
                    String country = scanner.nextLine();

                    Company company1 = new Company(newCompanyId, newCompanyName, industry, country);

                    companyStorage.add(company1);
                    break;

                case 6:
                    companyStorage.printAll();
                    break;

                case 7: {
                    System.out.println("Please input company ID:");
                    String searchCompanyId = scanner.nextLine();

                    Company foundCompany = companyStorage.getById(searchCompanyId);

                    if (foundCompany != null) {
                        System.out.println("Company found:");
                        System.out.println(foundCompany);
                    } else {
                        System.out.println("Company noot found.");
                    }
                    break;
                }

                case 8: {
                    System.out.println("Please input company ID:");
                    String companyIdForEmployees = scanner.nextLine();

                    Company company2 = companyStorage.getById(companyIdForEmployees);

                    if (company2 == null) {
                        System.out.println("Company not found.");
                    } else {
                        System.out.println("Company: " + company2.getName());
                        System.out.println("Employees:");
                        employeeStorage.printByCompanyId(companyIdForEmployees);
                    }

                    break;

                }
                case 9: {
                    System.out.println("Please input employe ID:");
                    String id = scanner.nextLine();

                    Employee emp = employeeStorage.searchById(id);

                    if (emp == null) {
                        System.out.println("Employee nnot found!");
                        break;
                    }

                    System.out.println("Current company:" + emp.getCompany().getName());

                    System.out.println("Please input new company ID:");
                    String newId = scanner.nextLine();

                    Company newCompany = companyStorage.getById(newId);

                    if (newCompany == null) {
                        System.out.println("Company not found!");
                    } else {
                        emp.setCompany(newCompany);
                        System.out.println("Employee company successfully change!");
                        System.out.println("New company:" + newCompany.getName());
                    }
                    break;
                }
                case 10:{
                    System.out.println("Please input employee ID:");
                    String Id = scanner.nextLine();

                    Employee emp = employeeStorage.searchById(Id);

                    if (emp == null) {
                        System.out.println("Employee not fonud!");
                    } else {
                        System.out.println("Employee:" + emp.getName() + " " + emp.getSurname());

                        System.out.println("Company information:");

                        System.out.println("ID:" + emp.getCompany().getCompanyId());

                        System.out.println("Name:" + emp.getCompany().getName());

                        System.out.println("Industry:" + emp.getCompany().getIndustry());

                        System.out.println("Country:" + emp.getCompany().getCountry());
                    }
                    break;
            }

                case 11:
                    System.out.println("Please input minimum salary:");
                    int minSalary = scanner.nextInt();
                    scanner.nextLine();

                    employeeStorage.searchBYMinSalary(minSalary);

                    break;

                case 12:
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
