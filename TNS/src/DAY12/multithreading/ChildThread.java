package DAY12.multithreading;

public class ChildThread extends Thread {

    private int n;
    private String msg;

    // Constructor to initialize n and msg
    public ChildThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(6000); // pause for 1 second
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(i + " " + msg);
        }
    }
}
