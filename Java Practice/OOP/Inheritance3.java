class Alpha{
    int a,b;
}
class Beta extends Alpha{
    int c,d;
    Beta(){
        c = 30;
        d = 40;
        System.out.println("Beta zero Parameterized Constructor Called");
    }
    void display(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.display();
    }
}
