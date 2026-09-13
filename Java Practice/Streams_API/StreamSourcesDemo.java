package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesDemo {
    public static void main(String[] args){

        // 1. From Collections --------------------------------------------------
        List<String> list = List.of("Apple", "Banana", "Cherry");
        Stream<String> fromList = list.stream();
        fromList.forEach(System.out::println);

        Map<Integer, String> map = Map.of(1, "One", 2, "Two");
        Stream<Map.Entry<Integer, String>> fromMap = map.entrySet().stream();
        fromMap.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // 2. From Arrays -------------------------------------------------------
        String[] arr = {"Red", "Green", "Blue"};
        Stream<String> fromArray = Arrays.stream(arr);
        fromArray.forEach(System.out::println);

        // 3. Using Stream.of() -------------------------------------------------
        Stream<Integer> directStream = Stream.of(10, 20, 30);
        directStream.forEach(System.out::println);

        // 4. Primitive Streams (IntStream, LongStream, DoubleStream) -----------
        IntStream rangeExclusive = IntStream.range(1, 5);       // 1, 2, 3, 4
        rangeExclusive.forEach(x -> System.out.print(x + " "));
        System.out.println();
        IntStream rangeInclusive = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
        rangeInclusive.forEach(System.out::print); // 12345
        System.out.println();

        // 5. Infinite / Generated Streams --------------------------------------
        // Stream.iterate(seed, unaryOperator)
        Stream<Integer> evens = Stream.iterate(0, n -> n + 2)
                                      .limit(5); // 0, 2, 4, 6, 8
        evens.forEach(System.out::println);

        // Stream.generate(Supplier)
        Stream<Double> randoms = Stream.generate(Math::random)
                                        .limit(3);
        randoms.forEach(System.out::println);

        // 6. From Other APIs (Strings, Regex, Files, Random) -------------------
        // String chars
        IntStream charStream = "Hello".chars();
        charStream.forEach(ch -> System.out.print((char) ch + " ")); // H e l l o
        System.out.println();

        // Regex split
        Stream<String> words = Pattern.compile(",\\s*")
                                      .splitAsStream("car, bike, truck");
        words.forEach(System.out::println);

        // Random numbers generator
        new Random().ints(3, 1, 100)
                    .forEach(System.out::println);

    }
}