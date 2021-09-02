import java.util.ArrayList;
import java.util.List;

public class Systemos {


    public static class out {


        public static void println(int content) {
            System.out.println(content);
        }

        public static void println(Object content) {
            System.out.println(content);
        }

        public static void println(Object[] content) {
            for (Object object : content) {
                System.out.println(object);
            }

        }

        public static void println(List<Object> content){
            content.forEach((object -> println(object)));

        }
    }
}