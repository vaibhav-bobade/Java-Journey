package Functional_Interfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 != 0;

        System.out.println(isEven.test(4)); //true
        System.out.println(isOdd.test(4));  //false


        //Predicate Primitives(non Generic)--------------------------------------
        IntPredicate even = x -> x % 2 == 0;
        IntPredicate isMultiplierOf5 = x -> {
            if(x > 0){
                return x % 5 == 0;
            }
            return false;
        };

        System.out.println(even.test(4));  //true
        System.out.println(even.test(5));  //false
        System.out.println(isMultiplierOf5.test(4));  //false
        System.out.println(isMultiplierOf5.test(10));  //true


        LongPredicate isMultiplierOf15 = x -> {
            if(x > 0){
                return x % 15 == 0;
            }
            return false;
        };

        System.out.println(isMultiplierOf15.test(0));  //false
        System.out.println(isMultiplierOf15.test(180));  //true

        DoublePredicate isTaxable = amt -> amt > 12_00_000.00;
        double salary1 = 1150000.00;
        double salary2 = 1500000.00;
        System.out.println(isTaxable.test(salary1));  //false
        System.out.println(isTaxable.test(salary2));  //true


        //Predicate Composition methods: and(), or(), negate()----------------------------------
        Predicate<Integer> isGreaterThan10 = x -> x > 10;
        //isEven is declared already

        // .and()
        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10);
        System.out.println(isEvenAndGreaterThan10.test(4));  //false
        System.out.println(isEvenAndGreaterThan10.test(44));  //true

        // .or()
        Predicate<Integer> isEvenOrGreaterThan10 = isEven.or(isGreaterThan10);
        System.out.println(isEvenOrGreaterThan10.test(9));  //false
        System.out.println(isEvenOrGreaterThan10.test(11));  //true

        // .negate()
        Predicate<Integer> odd = isEven.negate();
        System.out.println(odd.test(4));  //false
        System.out.println(odd.test(5));  //true
    }
}