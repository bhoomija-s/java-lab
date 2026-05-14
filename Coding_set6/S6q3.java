/*Write a Java program where a thread prints numbers from 1 to 10, pausing for 1 second
between each number using the sleep() method.
Display a message before and after sleeping to observe the delay in execution. */
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("count is..." + i);

            try {
                System.out.println("Before Sleep "+ i);
                Thread.sleep(1000); 
                System.out.println("After Sleep "+ i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}


public class S6q3 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
       
        t1.start();
        

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread execution finished.");
    }
}