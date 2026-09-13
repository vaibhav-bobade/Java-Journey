package Streams_API;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class StreamIntermediateDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Vaibhav", "Alice", "Rohit", "Abhishek", "Yash", "ABCD");

        // 1. filter: Keep elements matching a Predicate ------------------------
        System.out.println("--- filter() ---");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println); //Alice Abhishek ABCD

        // 2. map: Transform elements via Function<T, R> ------------------------
        System.out.println("--- map() ---");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 3. flatMap: Flatten nested collections into a single stream ----------
        System.out.println("--- flatMap() ---");
        List<List<String>> nested = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        nested.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::print); // ABCD
        System.out.println();

        // 4. distinct: Remove duplicates (uses equals/hashCode) ----------------
        System.out.println("--- distinct() ---");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        // 5. sorted: Natural or custom Comparator ordering ---------------------
        System.out.println("--- sorted() ---");
        names.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);

        // 6. peek: Perform an action (Consumer) without altering the stream ----
        System.out.println("--- peek() ---");
        names.stream()
                .filter(n -> n.length() > 4)
                .peek(n -> System.out.println("Passed filter: " + n))
                .map(String::toLowerCase)
                .forEach(n -> System.out.println("Result: " + n));

        // 7. limit & skip: Pagination operations -------------------------------
        System.out.println("--- skip() and limit() ---");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .skip(3)  // drops 1, 2, 3
                .limit(4) // keeps 4, 5, 6, 7
                .forEach(n -> System.out.print(n + " ")); // 4 5 6 7
        System.out.println();

        // 8. takeWhile & dropWhile (Java 9+) -----------------------------------
        System.out.println("--- takeWhile() and dropWhile() ---");
        List<Integer> ordered = List.of(2, 4, 6, 7, 8, 10);

        // Stops consuming once predicate fails
        ordered.stream()
                .takeWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " ")); // 2 4 6
        System.out.println();

        // Drops elements while predicate matches, takes the rest
        ordered.stream()
                .dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " ")); // 7 8 10
        System.out.println();
    }
}