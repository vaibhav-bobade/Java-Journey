import java.util.Optional;

public class OptionalValueExtraction {
    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> name = Optional.of("Vaibhav");
        Optional<String> nullableOptional = Optional.ofNullable(null);

        //If we try to extract value of empty Optinal through get() method 
        // it will give NoSuchElementException: No value present
        //System.out.println(emptyOpt.get());
        System.out.println(name.get());

        //we can provide alternating value if value is not present
        System.out.println(emptyOpt.orElse("This is Empty"));
        System.out.println(name.orElse("Unknown"));   //It will give name because thats present

        //We can generate value if Optional contains null or is Empty
        String demo = nullableOptional.orElseGet(() -> "Guest" + (int)(Math.random() * 100));
        System.out.println(demo);

        //We can throw Exception if we need Value
        //String value = nullableOptional.orElseThrow(() -> new IllegalArgumentException("username is required"));
        //System.out.println(value);

        //we can also check if the value present or not inside Optional
        if(name.isPresent()){
            System.out.println(name.get());
        }

        //We prefer ifPresent() method because it will not do anything if value is empty/null
        
        emptyOpt.ifPresent(x -> System.out.println(x));
        name.ifPresent(val -> System.out.println(val));
    }
}


/* Output
Vaibhav
This is Empty
Vaibhav
Guest74
Vaibhav
Vaibhav
 */