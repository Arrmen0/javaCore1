package homeworks.employee;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private int salary;
    private String company;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname,
                    String employeeID, int salary,
                    String company, String position) {

        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID){

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Employee employee = (Employee) obj;

        return  Objects.equals(employeeID, employee.employeeID);

    }
        @Override
        public int hashCode() {
            return Objects.hash(employeeID);
        }
}