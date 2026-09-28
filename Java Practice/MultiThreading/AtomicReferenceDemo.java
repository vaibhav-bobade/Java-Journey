package MultiThreading;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDemo {
    public static void main(String[] args){

        SeatBooking booking = new SeatBooking();
        Thread t1 = new Thread(() -> {
            System.out.println(booking.bookSeat("Vaibhav"));
        });
        Thread t2 = new Thread(() -> booking.bookSeat("Rohit"));
        Thread t3 = new Thread(() -> booking.bookSeat("Sham"));
        Thread t4 = new Thread(() -> booking.bookSeat("Rohan"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(booking.seat.get() + " Booked Seat Successfully.");
    }
}
class SeatBooking{
    AtomicReference<String> seat = new AtomicReference<>("EMPTY");
    String currValue = seat.get();

    public boolean bookSeat(String userName){
        if(currValue.equals("EMPTY") == false) {
            return false;
        }
        return seat.compareAndSet("EMPTY", userName);
    }
}

/*
true
Vaibhav Booked Seat Successfully.
 */