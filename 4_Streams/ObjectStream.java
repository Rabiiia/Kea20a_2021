import java.util.Date;
import java.util.stream.Stream;

public class ObjectStream {

    public static void main(String[] args) {
       // Stream<Date> clock = Stream.generate((Date::new));
        // clock.forEach(timestamp -> System.out.println(timestamp)); eller clock.forEach(System.out::println);

        //Alternativ metode som den vist ovenfor

        /*
        Stream<Date> clock = Stream.generate(() -> new Date());
         clock.forEach(timestamp -> {
         System.out.println(timestamp);}); */

    }
}
