package inheritanceoveriding;

class Person {
    String name;
    String address;

    Person() {}

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
