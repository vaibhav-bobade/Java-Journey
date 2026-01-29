class Dog5{
    String name;
    String colour;
    int age;

    Dog5(){
        System.out.println("Zero Parameterized Constructor");
    }
    Dog5(String name){
        this();
        System.out.println("One Parameter Constructor");
        this.name = name;
        this.colour = "Brown";
        this.age = 1;
    }
    Dog5(String name, String colour, int age){
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
        Dog5 dog = new Dog5("Sheru", "White", 2);
        dog.show();
    }
}
