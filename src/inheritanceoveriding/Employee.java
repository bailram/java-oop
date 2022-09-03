package inheritanceoveriding;

class Employee extends Person{
    String position;

    Employee() {}

    Employee(String name, String address, String position) {
        super(name, address); // memanggil super constructor
        this.position = position;
    }

    /**
     * overriding
     * untuk melakukan overiding. nilai return dan parameternya harus sama dengan yang ada di class parentnya
     */
    void sayHello() {
        System.out.println("Hi, my name is "
                + name
                + ". I am working as "
                + position);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is "
                + this.name
                + ". I am working as "
                + position);
    }
}
