package percobaanthread;

public class SingleThreadapp {
    public static void main(String[] args) {
        var t = new NewThread();
        System.out.println("start");
        t.start();
        System.out.println("response");
    }
}
