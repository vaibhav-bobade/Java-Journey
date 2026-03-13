class ABCD{
    public static int a = 10;
    public static void spell(){
        System.out.println(a);
        System.out.println("ABCD");
    }
}
class EFGH extends ABCD{
    public static void spell(){
        System.out.println("EFGH");
        a=20;
        System.out.println("After change a: " + a);
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        //ABCD abcd = new ABCD();
        ABCD.spell();
        System.out.println("------------------");
        //EFGH efgh= new EFGH();
        EFGH.spell();

    }
}

/*10
ABCD
------------------
EFGH
After change a: 20
*/