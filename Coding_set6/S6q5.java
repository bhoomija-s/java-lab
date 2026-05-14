/*Write a Java program to create three threads with different priorities:
• Minimum Priority (Thread.MIN_PRIORITY)
• Normal Priority (Thread.NORM_PRIORIEach thread should display its name and priority value while executing.
• Maximum Priority (Thread.MAX_PRIORITY)
TY)
Observe whether priority affects execution order.*/
class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name); 
    }

    public void run() {
        

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "  " + getPriority() + "  " + i);
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class s6p5 {
    public static void main(String[] args) {
        
        
        PriorityThread t1 = new PriorityThread("Min ");
        PriorityThread t2 = new PriorityThread("Norm"); 
        PriorityThread t3 = new PriorityThread("Max ");

        
        t1.setPriority(Thread.MIN_PRIORITY);    
        t2.setPriority(Thread.NORM_PRIORITY);   
        t3.setPriority(Thread.MAX_PRIORITY);    
        
        
       
        t1.start();
        t2.start();
        t3.start();

       
        System.out.println("Main Thread | Priority-  " + Thread.currentThread().getPriority());

        System.out.println("Name |" + " Priority |" + " Count " );
    }
}