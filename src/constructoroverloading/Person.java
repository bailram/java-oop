package constructoroverloading;

class Person {
    String name;
    String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) {
        this(name, null);
    }

    Person() {
        /**
         * sebenernya gak perlu ini juga gpp, cuman kalau misalnya diperlukan untuk menjalankan code yang ada di
         * constructor dengan parameter 1, maka harus ditambahkan ini
         */
        this(null);
    }

    // method overloading
    void sayHello() {
        System.out.println("Hi, my name is " + name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is " + this.name);
    }
}
