package OOP;

interface A {
    default void speak() {
        System.out.println("Hello from A");
    }
}
interface B {
    default void speak() {
        System.out.println("Hello from B");
    }
}

class  C implements A, B {
    @Override
    public void speak() {
        A.super.speak();
        B.super.speak();
    }
    public void helloC() {
        System.out.println("Hello from C");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        C  obj = new C();
        obj.speak();
        obj.helloC();
    }
}