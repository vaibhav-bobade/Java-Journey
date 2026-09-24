package MultiThreading;

public class RaceConditionDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Counting c = new Counting();
        Thread t1 = new Thread( () -> {
            for(int i = 1; i <= 1000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i = 1; i <= 1000; i++){
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
        /*due to context switching, the total count can give unexpected value
        Output:
        Main thread starts
        Count is: 1821
        */
    }
}

class Counting {
    int count;
    void increment(){
        count++;
    }
}