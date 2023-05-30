package MultiThreading;

public class ExtendingThread {
    
    public void run(){
        for (int i=1; i<4; i++){
            System.out.println("Running from class : " + i);
        }
    }
}
