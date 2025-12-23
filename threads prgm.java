class RunnableThread implements Runnable { 
    RunnableThread(String tn) { 
        Thread.currentThread().setName(tn); 
    } 
 
    public void start() { 
        run(); 
    } 
 
    public void run() { 
        try { 
            Thread.sleep(1000); 
            System.out.println(Thread.currentThread().getName() + " Created and is Running"); 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
 
class Program11 { 
    public static void main(String args[]) { 
        RunnableThread rt1 = new RunnableThread("T1"); 
        rt1.start(); 
        RunnableThread rt2 = new RunnableThread("T2"); 
        rt2.start(); 
        RunnableThread rt3 = new RunnableThread("T3"); 
        rt3.start(); 
    } 
}
