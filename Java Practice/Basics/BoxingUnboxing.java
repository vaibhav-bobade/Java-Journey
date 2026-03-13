public class BoxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(20);
        System.out.println("Before Boxing a: " + a);
        System.out.println("Before Unboxing b: " + b);
        //Boxing: It is the process of Convering primitive data type into its corresponding Wrapper Class Object.It has two types Boxing and Auto-Boxing.
        //Auto-Boxing: Automatically Boxing by Java Compiler.
        Integer a2 = Integer.valueOf(a);
        Integer a3 = a;
        System.out.println("--------------------------------");
        System.out.println("Boxing value of a: "+ a2);
        System.out.println("Auto-Boxing value of a: "+ a3);

         System.out.println("--------------------------------");
         //UnBoxing: Opposite to Boxing.
         //Auto-UnBoxing: Automatically UnBoxing by Java Compiler.

         int b2 = b.intValue();
         int b3 = b;
         System.out.println("UnBoxing value of b: " + b2);
         System.out.println("Auto-UnBoxing value of b: " + b3);
    }
}
