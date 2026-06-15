//Inner Class - Member
package OOP;

class Car {
    private String model;

    public class Engine {
        private Boolean isEV;

        public Engine(String mod, Boolean isEv){
            this.isEV = isEv;
            model = mod;
        }
        public String getModel(){
            return model;
        }
        public Boolean getIsEV() {
            return isEV;
        }
    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine ce = car.new Engine("Ather", true);

        System.out.println("The Model of the Car is: " + ce.getModel());
        System.out.println("Is Car Electric: " + ce.getIsEV());
    }
}

/*Output

The Model of the Car is: Ather
Is Car Electric: true

*/