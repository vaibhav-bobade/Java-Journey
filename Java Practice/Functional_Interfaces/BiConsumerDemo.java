package Functional_Interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // Generic BiConsumer
        BiConsumer<String, String> greet = (firstName, lastName) ->
                System.out.println("Hello, " + firstName + " " + lastName);

        greet.accept("Jane", "Doe"); // Hello, Jane Doe

        // Practical usage in Maps
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 28);
        ages.put("Bob", 34);
        ages.forEach((name, age) -> System.out.println(name + " is " + age));

        // BiConsumer Primitives (Object + Primitive) ---------------------------
        ObjIntConsumer<String> printScore = (name, score) ->
                System.out.println(name + " scored " + score);
        printScore.accept("Player1", 99); // Player1 scored 99

        ObjDoubleConsumer<String> applyDiscount = (item, discount) ->
                System.out.println(item + " gets " + discount + "% off");
        applyDiscount.accept("Laptop", 15.5); // Laptop gets 15.5% off

        // BiConsumer Composition: andThen() ------------------------------------
        BiConsumer<String, Integer> printInfo = (name, age) -> System.out.print(name + ": ");
        BiConsumer<String, Integer> printAge = (name, age) -> System.out.println(age + " yrs");

        BiConsumer<String, Integer> fullLog = printInfo.andThen(printAge);
        fullLog.accept("Charlie", 42);
        // Output: Charlie: 42 yrs
    }
}