package polymorphism;

class Employee {
    String name;

    Employee() {}

    Employee(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, employee " + name);
    }
}
