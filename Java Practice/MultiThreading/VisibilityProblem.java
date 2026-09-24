package MultiThreading;

public class VisibilityProblem {
    static volatile boolean flag = true; // volatile Whenever one thread changes flag, other threads must see the latest value.
    public static void main(String[] args) {
        System.out.println("Main method starts");

        Thread t1 = new Thread(() ->  {
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){}
            flag = false;
            System.out.println("Thread 1 ends");
        });
        Thread t2 = new Thread(() -> {
            int i = 0;
            while(flag == true) {
                System.out.println("Thread 2 is Runs " + i + " times");
                i++;
            }
        });

        t1.start();
        t2.start();
    }
}