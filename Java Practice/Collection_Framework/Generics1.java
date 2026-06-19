package Collection_Framework;

//Without Generics----------------------------
//Suppose we have to store Objects in a Box, for that we need to Create different Classes for diff Types
class IntegerBox {
    private Integer content;

    public void setContent(Integer content) {
        this.content = content;
    }
    public Integer getContent() {
        return content;
    }
}
class StringBox {
    private String content; // Cloned code just for a different type!

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}

//With Generics------------------------------
class Box<T> {
    private T content;
    public void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}
public class Generics1 {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.setContent(21);
        System.out.println(intBox.getContent()); //21

        StringBox strBox = new StringBox();
        strBox.setContent("Hello");
        System.out.println(strBox.getContent()); //Hello

        System.out.println("----------------------------------------");
        //With Generics
        //Storing Integer in Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(100);
        System.out.println(integerBox.getContent()); //100

        //Storing String in Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Have a Good Day");
        System.out.println(stringBox.getContent()); //Hello, Have a Good Day
    }
}