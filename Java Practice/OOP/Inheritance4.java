class Alpha1{
    int a,b;
    public Alpha1(){
        System.out.println("Alpha Zero Parameterized Constructor Called");
    }
    public Alpha1(int a, int b){
        this();
        this.a = a;
        this.b = b;
        System.out.println("Alpha Parameterized Constructor Called");
    }
}
class Beta1 extends Alpha1{
    int c,d;
    Beta1(int c, int d){
        super(10,20);
        this.c = c;
        this.d = d;
        System.out.println("Beta Parameterized Constructor Called");
    }
    void display(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}


public class Inheritance4 {
    public static void main(String[] args) {
        Beta1 b1 = new Beta1(30,40);
        b1.display();
    }
}
