package exception;

public class ExceptionApp {
    public static void main(String[] args) {
        try {
            ValidationUtil.validate("");
        } catch (ValidationException e) {
            System.out.println("Terjadi error dengan pesan : " + e.getMessage());
        }
    }
}
