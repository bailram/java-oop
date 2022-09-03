package inheritanceoveriding;

public class InheritanceApp {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.name = "Dhimas";
        employee.position = "Fullstack Developer";
        employee.sayHello();
        employee.sayHello("Bayu");
    }
}
