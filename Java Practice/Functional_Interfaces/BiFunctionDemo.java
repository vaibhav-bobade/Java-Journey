package Functional_Interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // Generic BiFunction
        BiFunction<Integer, Integer, String> concat = (a, b) -> a + " and " + b;
        System.out.println(concat.apply(5, 10)); // 5 and 10

        BiFunction<Double, Double, Double> calculatePower = (base, exp) -> Math.pow(base, exp);
        System.out.println(calculatePower.apply(2.0, 3.0)); // 8.0

        // BiFunction Primitives (Object, Object -> Primitive) ------------------
        ToIntBiFunction<String, String> compareLength = (s1, s2) ->
                Integer.compare(s1.length(), s2.length());

        System.out.println(compareLength.applyAsInt("Java", "C")); // 1 (Java is longer)

        ToDoubleBiFunction<Integer, Integer> calculateHypotenuse = (a, b) ->
                Math.sqrt((a * a) + (b * b));

        System.out.println(calculateHypotenuse.applyAsDouble(3, 4)); // 5.0

        // BiFunction Composition: andThen() ------------------------------------
        // Note: andThen takes a Function (1 argument), not a BiFunction,
        // because the output of the BiFunction is a single value.
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Function<Integer, String> formatResult = result -> "Result: " + result;

        BiFunction<Integer, Integer, String> multiplyAndFormat = multiply.andThen(formatResult);
        System.out.println(multiplyAndFormat.apply(5, 4)); // Result: 20
    }
}