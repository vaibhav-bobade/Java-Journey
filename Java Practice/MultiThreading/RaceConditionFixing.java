package MultiThreading;

public class RaceConditionFixing {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Counting1 c = new Counting1();
        Thread t1 = new Thread( () -> {
            for(int i = 1; i <= 5000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i = 1; i <= 5000; i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){}
        System.out.println("Count is: " + c.count);
        /* synchronized keyword make sure that only one thread will handle the task and complete it
        Output:
        Main thread starts
        Count is: 10000
        */
    }
}

class Counting1 {
    int count;
    synchronized void increment(){
        count++;
    }
}