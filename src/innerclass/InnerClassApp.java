package innerclass;

public class InnerClassApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Google");

        Company.Employee employee = company.new Employee();
        employee.setName("Dhimas");

        System.out.println("employee name : " + employee.getName());
        System.out.println("employee company : " + employee.getCompany());
    }
}
