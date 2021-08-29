import java.util.*;

class extendThread extends Thread {

    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        System.out.println("Thread is implemented by class thread");
    }
}

class implementThread implements Runnable {

    public void sleep() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    

    public void run() {
        System.out.println("Thread is implemented by runnable interface");
    }
}

public class threadSleep {

    public static void main(String[] args) {
        extendThread fetchData = new extendThread();
        implementThread processData = new implementThread();
        
        System.out.println("fetchData thread sleep started");
        fetchData.sleep();
        fetchData.run();

        System.out.println("processData thread sleep started");
        processData.sleep();
        processData.run();
    }
}
