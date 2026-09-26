package MultiThreading;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        System.out.println("Program Starts...");
        PC pc = new PC();

        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                pc.produced(i);
            }
        });
        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                pc.consumed();
            }
        });
        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {}
        System.out.println("Program Ends...");
    }
}
class PC {
    int data;
    boolean flag = false;

    public synchronized void produced(int data){
        while(flag){
            try {
                Thread.sleep(100);
                wait();
            } catch (InterruptedException e) {}
        }
        this.data = data;
        flag = true;
        System.out.println("Producer produced: " + data);
        notifyAll();
    }
    public synchronized void consumed(){
        while(!flag) {
            try {
                Thread.sleep(100);
                wait();
            } catch (InterruptedException e) {
            }
        }
        flag = false;
        System.out.println("Consumer consumed: " + data);
        this.data = 0;
        notifyAll();
    }
}

/*
Program Starts...
Producer produced: 0
Consumer consumed: 0
Producer produced: 1
Consumer consumed: 1
Producer produced: 2
Consumer consumed: 2
Producer produced: 3
Consumer consumed: 3
Producer produced: 4
Consumer consumed: 4
Producer produced: 5
Consumer consumed: 5
Producer produced: 6
Consumer consumed: 6
Producer produced: 7
Consumer consumed: 7
Producer produced: 8
Consumer consumed: 8
Producer produced: 9
Consumer consumed: 9
Program Ends...
 */