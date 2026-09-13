package Streams_API;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalDemo {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Apricot", "Blueberry", "Avocado");

        // 1. Collectors: toList, toSet, toMap, joining -------------------------
        System.out.println("--- Collectors ---");
        List<String> list = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list); //[APPLE, BANANA, APRICOT, BLUEBERRY, AVOCADO]

        Set<String> set = fruits.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toSet());

        String joined = fruits.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined: " + joined);
        //Joined: [Apple, Banana, Apricot, Blueberry, Avocado]

        // Grouping and Partitioning
        Map<Character, List<String>> groupedByFirstLetter = fruits.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Grouped: " + groupedByFirstLetter);
        //Grouped: {A=[Apple, Apricot, Avocado], B=[Banana, Blueberry]}

        Map<Boolean, List<String>> partitionedByLength = fruits.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println("Partitioned (>5 chars): " + partitionedByLength);
        //Partitioned (>5 chars): {false=[Apple], true=[Banana, Apricot, Blueberry, Avocado]}

        // 2. Iteration: forEach, forEachOrdered --------------------------------
        System.out.println("--- Iteration ---");
        fruits.forEach(System.out::println);

        // 3. Matching: anyMatch, allMatch, noneMatch ---------------------------
        System.out.println("--- Matching ---");
        boolean anyStartsWithA = fruits.stream()
                                       .anyMatch(s -> s.startsWith("A"));

        boolean allLongerThan3 = fruits.stream()
                                       .allMatch(s -> s.length() > 3);

        boolean noneStartsWithZ = fruits.stream()
                                        .noneMatch(s -> s.startsWith("Z"));

        System.out.println("Any 'A': " + anyStartsWithA);       // true
        System.out.println("All > 3: " + allLongerThan3);       // true
        System.out.println("None 'Z': " + noneStartsWithZ);     // true

        // 4. Finding: findFirst, findAny ---------------------------------------
        System.out.println("--- Finding ---");
        Optional<String> firstFruit = fruits.stream()
                .filter(s -> s.startsWith("B"))
                .findFirst();
        firstFruit.ifPresent(f -> System.out.println("First B fruit: " + f)); // Banana

        // 5. Aggregations: count, min, max -------------------------------------
        System.out.println("--- Aggregations ---");
        long count = fruits.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("Count starting with A: " + count); // 3

        Optional<String> shortest = fruits.stream()
                .min(Comparator.comparingInt(String::length));
        shortest.ifPresent(s -> System.out.println("Shortest: " + s)); // Apple

        // 6. Reduction: reduce() -----------------------------------------------
        System.out.println("--- Reduction ---");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // reduce with identity: accumulator
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // 15

        // reduce without identity: returns Optional
        Optional<Integer> product = numbers.stream()
                .reduce((a, b) -> a * b);
        product.ifPresent(p -> System.out.println("Product: " + p)); // 120

        // 7. Array conversion: toArray -----------------------------------------
        String[] fruitArray = fruits.stream()
                .toArray(String[]::new);
        System.out.println("Array length: " + fruitArray.length); // 5
        System.out.println(Arrays.toString(fruitArray));
        //[Apple, Banana, Apricot, Blueberry, Avocado]
    }
}