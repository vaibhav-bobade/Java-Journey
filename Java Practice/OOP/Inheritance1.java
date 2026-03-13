class Animal{
    void eat(){
        System.out.println("This Animal eats Food");
    }
}
class Dog4 extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.eat();
        dog.bark();
    }
}
