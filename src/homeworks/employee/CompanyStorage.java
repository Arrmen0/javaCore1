package homeworks.employee;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(company.getCompanyId())) {
                System.out.println("Company already exists!");
                return;
            }
        }
        if (size == companies.length) {
            grow();
        }
        companies[size] = company;
        size++;
    }

    private void grow() {
        Company[] newCompanies = new Company[companies.length * 2];
        for (int i = 0; i < size; i++) {
            newCompanies[i] = companies[i];
        }
        companies = newCompanies;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
}

