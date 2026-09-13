package Functional_Interfaces;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Generic Consumer
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());

        printUpper.accept("hello");   // HELLO
        printLength.accept("hello");  // Length: 5

        // Consumer Primitives (avoid autoboxing) --------------------------------
        IntConsumer printSquare = x -> System.out.println("Square: " + (x * x));
        printSquare.accept(5); // Square: 25

        LongConsumer printTimestamp = ms -> System.out.println("Time: " + ms + " ms");
        printTimestamp.accept(1726210000000L); // Time: 1726210000000 ms

        DoubleConsumer applyDiscount = price -> System.out.println("Discounted: " + (price * 0.9));
        applyDiscount.accept(199.99); // Discounted: 179.991

        // Consumer Composition: andThen() -------------------------------------
        // Executes the first consumer, then passes the same input to the next
        Consumer<String> printUpperAndLength = printUpper.andThen(printLength);
        printUpperAndLength.accept("world");
        // Output:
        // WORLD
        // Length: 5
    }
}