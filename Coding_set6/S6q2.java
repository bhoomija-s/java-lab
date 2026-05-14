/*Write a Java program to create a thread by implementing the Runnable interface.
The thread should display numbers from 1 to 5 along with the thread name.
Compare this approach with extending the Thread class by printing output from the main
thread as well.*/
class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread (" + Thread.currentThread().getName() + "): " + i);

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}


public class S6q2 {
    public static void main(String[] args) {

        
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread finished.");
    }
}