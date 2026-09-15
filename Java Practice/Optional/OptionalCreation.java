package Optional;
import java.util.Optional;

public class OptionalCreation{
    public static void main(String[] args) {
        //Optional can be created by 3 ways
        // 1.Empty Optional
        Optional<String> emptyOpt = Optional.empty();

        // 2.Optional with Value
        Optional<String> name = Optional.of("Vaibhav");

        // 3.Optional value that can can be Null
        Optional<String> optNullable = Optional.ofNullable(null);

        //Getting the Value inside Optional
        System.out.println(emptyOpt.orElse("This Optional is Empty"));
        System.out.println(name.get());
        System.out.println(optNullable.orElse("Null Value"));
    }
}