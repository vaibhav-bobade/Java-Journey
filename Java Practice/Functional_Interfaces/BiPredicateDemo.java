package Functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // Generic BiPredicate
        BiPredicate<String, Integer> hasLength = (str, len) -> str.length() == len;
        BiPredicate<String, Integer> startsWithA = (str, len) -> str.startsWith("A");

        System.out.println(hasLength.test("Java", 4)); // true
        System.out.println(hasLength.test("Python", 4)); // false

        // BiPredicate Composition: and(), or(), negate() -----------------------
        BiPredicate<String, Integer> validAWord = hasLength.and(startsWithA);
        System.out.println(validAWord.test("Atom", 4));  // true
        System.out.println(validAWord.test("Apple", 4)); // false (length is 5)

        BiPredicate<String, Integer> isNotValidAWord = validAWord.negate();
        System.out.println(isNotValidAWord.test("Atom", 4)); // false
    }
}