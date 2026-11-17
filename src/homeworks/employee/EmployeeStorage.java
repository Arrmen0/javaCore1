package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    //1. Աշխատակցի ավելացում
    public void addEmployee(Employee employee) {

        if (searchById(employee.getEmployeeID()) != null) {
            System.out.println("Employee with ID " + employee.getEmployeeID() + " already exists.");
            return;
        }

        if (size == employees.length) {
            Employee[] newEmployees = new Employee[employees.length * 2];
            for (int i = 0; i < size; i++) {
                newEmployees[i] = employees[i];
            }
            employees = newEmployees;
        }
        employees[size] = employee;
        size++;

        System.out.println("Employee successfully added!");
    }

    //2. Բոլոր աշխատակիցների տպում
    public void printAll() {
        if (size == 0) {
            System.out.println("No employees found");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    //3. Որոնում Employee ID-ով
    public Employee searchById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }

    //4. Որոնում ընկերության անունով
    public void searchByCompany(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getName().equals(companyName)) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found company for company " + companyName);
        }
    }

    //Bonus 2 — Որոնել աշխատակիցներին ըստ աշխատավարձի
    public void searchBYMinSalary(int minSalary) {
        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with this salary!");
        }
    }

    //Bonus 3 — Հեռացնել աշխատակցին ID-ով
    public void deleteEmployeeById(String employeeID) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeID().equals(employeeID)) {

                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee successfully deleted!");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found!");
    }

    public void printByCompanyId(String companyId) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyId().equals(companyId)) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for this company!");
        }
    }

    public int countEmployeesByCompany(String comanyId) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany() != null && employees[i].getCompany().getCompanyId().equals(comanyId)) {
                count++;
            }
        }
            return count;

        }


    }


