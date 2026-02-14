public class BitManipulation {
    public static void main(String[] args) {
        System.out.println("Basic Bitwise Operators:");
        //Binary AND
        System.out.println("Binary AND of 5 & 6 is: "+ (5 & 6));

        //Binary OR
        System.out.println("Binary OR of 5 & 6 is: "+ (5 | 6));

        //Binary XOR
        System.out.println("Binary XOR of 5 & 6 is: "+ (5 ^ 6));

        //Binary 1's Compliment
        System.out.println("Binary 1's Compliment of 5 is: "+ (~5));

        //Binary Left Shift
        System.out.println("Binary Left Shift of 5<<2 is: "+ (5<<2));

        //Binary Right Shift
        System.out.println("Binary Rigth Shift of 5>>2 is: "+ (5>>2));
    }
}
