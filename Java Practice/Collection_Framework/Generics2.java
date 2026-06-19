package Collection_Framework;

public class Generics2 {

    // The <T> before 'void' tells Java this is a generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Generics", "Are", "Clear"};

        // we can pass completely different array types to the exact same method
        printArray(intArray);   // Outputs: 1 2 3 4 5
        printArray(stringArray); // Outputs: Java Generics Are Clear
    }
}