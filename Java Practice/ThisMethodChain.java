class Dog{
    String name;
    String colour;
    int age;

    Dog(){
        System.out.println("Zero Parameterized Constructor");
    }
    Dog(String name){
        this();
        System.out.println("One Parameter Constructor");
        this.name = name;
        this.colour = "Brown";
        this.age = 1;
    }
    Dog(String name, String colour, int age){
        this(name);
        System.out.println("Main Constructor called");
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: "+ name);
        System.out.println("Colour: "+ colour);
        System.out.println("Age: "+ age);
    }
}

public class ThisMethodChain {
    public static void main(String[] args) {
        Dog dog = new Dog("Sheru", "White", 2);
        dog.show();
    }
}
