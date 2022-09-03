package statickeyword;

public class Device {
    public final static int PROCESSOR;

    static {
        System.out.println("static block ini diakses ketika class device pertama kali dipanggil");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
