package polymorphism;

public class Staff extends Employee {
    String address;

    Staff() {}

    Staff(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("Hello, staff " + name);
    }
}
