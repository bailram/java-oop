package reflection;

public class ReflectionApp {
    public static void main(String[] args) {
        System.out.println("request");
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("asdads");
        request.setPassword("yrdtrdrt");
        ValidationReflectionUtil.validationReflection(request);

        // error
        System.out.println("request1");
        CreateUserRequest request1 = new CreateUserRequest();
        ValidationReflectionUtil.validationReflection(request1);
    }
}
