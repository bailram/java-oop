package reflection;

import exception.ValidationException;
import runtimeexception.BlankException;

import java.lang.reflect.Field;
import java.util.Objects;

public class ValidationReflectionUtil {
    public static void validationReflection(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (var field : fields) {
           field.setAccessible(true);
           if (field.getAnnotation(NotBlank.class) != null) { // pengecekkan anotasi not blank
               try {
                   String value = (String) field.get(obj);
                   if (value == null || value.isBlank() ) {
                       throw new BlankException("Field " + field.getName() + " is blank");
                   }
               } catch (IllegalAccessException e) {
                   System.out.println("tidak bisa mengakses field " + field.getName());
               }
           }
        }
    }
}
