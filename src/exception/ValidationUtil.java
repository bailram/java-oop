package exception;

import runtimeexception.BlankException;

import java.util.Objects;

public class ValidationUtil {
    /**
     * exception class extend ke throwable
     * jadi wajib untuk menambahkan throws
     */
    public static void validate(String username) throws ValidationException {
        if (Objects.isNull(username)) {
            throw new ValidationException("username is null");
        } else if (username.isEmpty()) {
            throw new ValidationException("username is empty");
        }
        System.out.println("Data valid");
    }

    /**
     * exception class yang extend ke RuntimeException
     * jadi tidak wajib untuk menambahkan throws
     */
    public static void validateRuntime(String username) {
        if (Objects.isNull(username)) {
            throw new NullPointerException("username is null");
        } else if (username.isEmpty()) {
            throw new BlankException("username is empty");
        }
        System.out.println("Data valid");
    }
}
