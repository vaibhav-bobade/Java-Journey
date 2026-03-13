class Aeroplane{
    public void takingoff(){
        System.out.println("The Aeroplane needs Long Runway to takeoff");
    }
    public void fly(){
        System.out.println("The Aeroplane is Flying");
    }
    public void landing(){
        System.out.println("The Aeroplane is Landing");
    }
}
class PassengerPlane extends Aeroplane{
    public void takingoff(){
        System.out.println("The PassengerPlane needs Long Runway to takeoff");
    }
    public void fly(){
        System.out.println("The PassengerPlane is Flying");
    }
    public void landing(){
        System.out.println("The PassengerPlane is Landing");
    }
}
class CargoPlane extends Aeroplane{
    public void takingoff(){
        System.out.println("The CargoPlane needs Long Runway to takeoff");
    }
    public void fly(){
        System.out.println("The CargoPlane is Flying");
    }
    public void landing(){
        System.out.println("The CargoPlane is Landing");
    }
}
class FighterPlane extends Aeroplane{
    public void takingoff(){
        System.out.println("The FighterPlane needs Long Runway to takeoff");
    }
    public void fly(){
        System.out.println("The FighterPlane is Flying");
    }
    public void landing(){
        System.out.println("The FighterPlane is Landing");
    }
}
class Airport{
    public void plane(Aeroplane pl){
        pl.takingoff();
        pl.fly();
        pl.landing();
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.plane(pp);
        a.plane(cp);
        a.plane(fp);
    }
}
