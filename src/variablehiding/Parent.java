package variablehiding;

class Parent {
    String name;

    void doIt() {
        System.out.println("do it in parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("do it in child");
    }
}
