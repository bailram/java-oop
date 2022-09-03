package percobaanthread;

public class NewThread extends Thread{
    public void run() {
        try {
        long startTime = System.currentTimeMillis();
        int i = 0;
        System.out.println("new thread running");
        var status = true;
        while (status) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);

                //Wait for one sec so it doesn't print too fast
                status = !doLinking(i);
                Thread.sleep( 1000);
        }
        System.out.println("send notification");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean doLinking(int i) {
        if (i > 5) {
            return true;
        } else {
            return false;
        }
    }
}
