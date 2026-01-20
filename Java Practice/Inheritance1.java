class Animal{
    void eat(){
        System.out.println("This Animal eats Food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
