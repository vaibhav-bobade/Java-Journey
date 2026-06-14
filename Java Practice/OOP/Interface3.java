package OOP;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck can Fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can Swim");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}