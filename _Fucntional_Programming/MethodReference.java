import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public MethodReference(String content){
        System.out.println(content);
    }
    public void out (String content){
        System.out.println(content);
    }

    public static void main(String[] args) {
       List<String> greetings = Arrays.asList("World", "Morgen");

       greetings.forEach((greeting) -> System.out.println(greeting)); //<------ not a method reference

        //method reference forskellige måder
        //greetings.forEach(new MethodReference()::out);

        //calls the constructor
        //greetings.forEach(MethodReference::new);

            }
}
