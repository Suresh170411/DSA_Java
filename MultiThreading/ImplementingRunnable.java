package MultiThreading;

public class ImplementingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<4; i++){
            System.out.println("Running using Interface : " + i);
        }
    }
}
