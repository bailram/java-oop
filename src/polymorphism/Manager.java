package polymorphism;

public class Manager extends Employee{
    String area;

    Manager() {}

    Manager(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("Hello, manager " + name);
    }
}
