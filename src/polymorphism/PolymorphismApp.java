package polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.name = "Dhimas";
        employee.sayHello();

        employee = new Manager();
        employee.name = "Bayu";
        employee.sayHello();

        employee = new Staff();
        employee.name = "Ilham";
        employee.sayHello();

        System.out.println();
        System.out.println("testing polymorphism, type check and casts");
        sayHi(new Employee("Ramadhan"));
        sayHi(new Manager("Dhimdhim"));
        sayHi(new Staff("Bailram"));
    }

    static void sayHi(Employee employee) {
        // do type check and casts for object
        if (employee instanceof Manager) {
            var manager = (Manager) employee;
            manager.sayHello();
        } else if (employee instanceof Staff) {
            var staff = (Staff) employee;
            staff.sayHello();
        } else {
            System.out.println("Hi, my name is " + employee.name);
        }
    }
}
