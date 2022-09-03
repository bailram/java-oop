package anonymousclass;

public class AnonymouseClassApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello world");
            }
        };

        english.sayHello();

        HelloWorld indonesian = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo dunia");
            }
        };

        indonesian.sayHello();
    }
}
