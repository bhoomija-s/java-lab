/*Write a Java program to create a new thread by extending the Thread class.
Inside the run() method, display numbers from 1 to 5 along with the name of the thread.
Also, print a message from the main thread to show that both threads execute concurrently.*/


class MyThread extends Thread {
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


public class S6p1 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread execution finished.");
    }
}