import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

class User{
    private String name;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }
    public Optional<String> getEmail(){
        return Optional.ofNullable(email);
    }
}

public class OptionalTransformation {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("AAAA", "aaa@mail.com"));
        users.add(new User("ABBA", "bbb@mail.com"));
        users.add(new User("CBDA", null));
        users.add(new User("CSDF", "csdf@gamail.com"));
        users.add(new User("DEFG", "dhvvackbjdkjb"));

        List<String> availableEmails = users.stream()
                                       .map(user -> user.getEmail())
                                       .filter(email -> email.isPresent())
                                       .map(email -> email.get())
                                       .filter(email -> email.contains("@"))
                                       .toList();
                                       
        System.out.println(availableEmails);
        //[aaa@mail.com, bbb@mail.com, csdf@gamail.com]
    }
}
