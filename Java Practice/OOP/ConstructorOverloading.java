class Dog{
    private String name;
    private String colour;
    private int price;

    public Dog(String name, String colour, int price){
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public Dog(){
        name = "Jojo";
        colour = "Brown";
        price = 10000;
    }

    public String getName(){
        return name;
    }
    public String getColour(){
        return colour;
    }
    public int getPrice(){
        return price;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        
        Dog d1 = new Dog("Tommy", "White", 10000);

        System.out.println(d1.getName());
        System.out.println(d1.getColour());
        System.out.println(d1.getPrice());

        System.out.println("--------------------------------------------------");

        Dog d2 = new Dog();
        System.out.println(d2.getName());
        System.out.println(d2.getColour());
        System.out.println(d2.getPrice());
    }
}
