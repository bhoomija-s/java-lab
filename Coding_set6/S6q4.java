/* Write a Java program to create a child thread that prints numbers from 1 to 5.
The main thread must wait for the child thread to complete using the join() method before
printing:
“Main thread resumes execution.” */

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


public class S6q4 {
    public static void main(String[] args) {

        
       MyThread t1 = new MyThread();
       t1.start();
       


            try {
                t1.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        

        System.out.println("Main thread resumes execution.");
    }

}
