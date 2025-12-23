class myThread extends Thread { 
    myThread(String tname) { 
        super(tname); 
    } 
 
    public void run() { 
        System.out.println(this.getName() + " Started..."); 
        try { 
            System.out.println(this.getName() + " Continues..."); 
            Thread.sleep(5000); 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
        System.out.println(this.getName() + " Completed."); 
    } 
} 
public class Program12 { 
    public static void main(String args[]) { 
        System.out.println("Main Thread Started."); 
        myThread mt = new myThread("Child-Thread"); 
        mt.start(); 
        System.out.println("Main Thread Continues..."); 
        try { 
            Thread.sleep(2000); 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
        System.out.println("Main Thread Completed."); 
    } 
} 
