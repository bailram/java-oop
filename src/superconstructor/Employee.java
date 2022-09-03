package superconstructor;

public class Employee extends Person{
    String position;

    Employee(String name) {
        /**
         * harus manggil constructor pakai super, karena di parent classnya harus ada value yang diinput ke
         * constructornya
         */
        super(name);
    }

    Employee(String name, String position) {
        /**
         * tapi kalau di class parentnya ada no args constructor, pemanggilan constructor parent ini gak perlu
         * dipanggil
         */
        super(name);
        this.position = position;
    }
}
