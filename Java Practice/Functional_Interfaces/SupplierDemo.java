package Functional_Interfaces;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Generic Supplier
        Supplier<String> idGenerator = () -> UUID.randomUUID().toString();
        Supplier<LocalDate> todaySupplier = LocalDate::now;

        System.out.println(idGenerator.get());   // e.g., 9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d
        System.out.println(todaySupplier.get()); // e.g., 2026-09-13

        // Supplier Primitives (avoid autoboxing) --------------------------------
        IntSupplier diceRoll = () -> (int) (Math.random() * 6) + 1;
        System.out.println("Dice: " + diceRoll.getAsInt()); // 1 to 6

        LongSupplier currentTime = System::currentTimeMillis;
        System.out.println("Epoch ms: " + currentTime.getAsLong());

        DoubleSupplier randomRatio = Math::random;
        System.out.println("Ratio: " + randomRatio.getAsDouble());

        BooleanSupplier isSystemReady = () -> true;
        System.out.println("Ready: " + isSystemReady.getAsBoolean()); // true
    }
}