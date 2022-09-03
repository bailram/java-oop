package runtimeexception;

import exception.ValidationUtil;

public class RuntimeExceptionApp {
    public static void main(String[] args) {
        try {
            ValidationUtil.validateRuntime("");
        } catch (Exception e) {
            System.out.println("error exception : " + e.getMessage());
            e.printStackTrace(); // class void untuk print detail error
        }
    }
}
