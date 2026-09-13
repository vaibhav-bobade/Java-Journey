package Functional_Interfaces;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongFunction;
import java.util.function.ToIntFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        // Generic Function<T, R>
        Function<String, Integer> stringLength = s -> s.length();
        Function<Integer, Integer> doubleValue = x -> x * 2;

        System.out.println(stringLength.apply("Java")); // 4
        System.out.println(doubleValue.apply(10));       // 20

        // Function Primitives --------------------------------------------------
        // Input primitive -> Object output
        IntFunction<String> intToString = x -> "Number: " + x;
        System.out.println(intToString.apply(42)); // Number: 42

        LongFunction<String> longToHex = l -> Long.toHexString(l);
        System.out.println(longToHex.apply(255L)); // ff

        DoubleFunction<String> currencyFormat = amt -> "$" + String.format("%.2f", amt);
        System.out.println(currencyFormat.apply(49.9)); // $49.90

        // Object input -> primitive output
        ToIntFunction<String> parseStr = s -> Integer.parseInt(s);
        System.out.println(parseStr.applyAsInt("123")); // 123

        // Primitive to primitive
        IntToDoubleFunction halfOf = x -> x / 2.0;
        System.out.println(halfOf.applyAsDouble(7)); // 3.5

        // Function Composition: andThen(), compose(), identity() --------------
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        // .andThen(): calculates multiplyBy2 first (5 * 2 = 10), then add10 (10 + 10 = 20)
        Function<Integer, Integer> multiplyThenAdd = multiplyBy2.andThen(add10);
        System.out.println(multiplyThenAdd.apply(5)); // 20

        // .compose(): calculates add10 first (5 + 10 = 15), then multiplyBy2 (15 * 2 = 30)
        Function<Integer, Integer> addThenMultiply = multiplyBy2.compose(add10);
        System.out.println(addThenMultiply.apply(5)); // 30

        // Function.identity(): returns input as-is (useful in streams and mappings)
        Function<String, String> identityFunc = Function.identity();
        System.out.println(identityFunc.apply("KeepMeSame")); // KeepMeSame
    }
}