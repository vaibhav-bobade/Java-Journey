class Vehicle{
    String brand;
    int maxSpeed;
    
    public Vehicle(String br){
        brand = br;
    }
}
class Car extends Vehicle{
    public Car(String br, int maxspd){
        super(br);
        maxSpeed = maxspd;
    }
    public void displayInfo(){
        System.out.println("The Car brand is: "+ brand);
        System.out.println("Max Speed is: "+ maxSpeed);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota",240);
        car.displayInfo();
    }
}
