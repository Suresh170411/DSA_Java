package MultiThreading;

public class Main {
    public static void main(String[] args) {

        ExtendingThread et = new ExtendingThread();
        
        ImplementingRunnable ir = new ImplementingRunnable();
        Thread t = new Thread(ir);
        
        et.start();
        t.start();
    }
}
