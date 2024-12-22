class CollegeThread extends Thread {
    synchronized public void run() {
        try {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted");
        }
    }
}

class CSEThread extends Thread {
    synchronized public void run() {
        try { 
                System.out.println("CSE");
                Thread.sleep(2000); 
            }
        catch (InterruptedException e) {
            System.out.println("CSEThread interrupted");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Threads have finished execution.");
    }
}
