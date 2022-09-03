package variablehiding;

public class VariableHidingApp {
    public static void main(String[] args) {
        var child = new Child();
        child.name = "Dhimas";
        child.doIt();
        System.out.println(child.name);

        System.out.println();
        var parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);

        /**
         * variable yang diakses adalah milik parent, tetapi method yang diakses tetap method override nya
         */
    }
}
