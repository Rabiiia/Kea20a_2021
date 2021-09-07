import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args){

        List<String> coolWords = Arrays.asList("Swag", "Swag", "Soft-ice", "");

        List<String> onlyWords = coolWords
                .stream()
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());

        long vocabulary = coolWords.stream().filter(word -> word.length() > 0).distinct().count();

        //coolWords.stream().filter(word -> word.length() > 0).distinct().collect(Collectors.toList()).size(); // langsom. Big O

        String sentence = coolWords.parallelStream()
                .filter(word -> !(word.equals("")))
                //.map(word -> word + " ") enten denne eller den nedunder
                .collect(Collectors.joining(" ")) + ".";
        System.out.println(sentence);


    }
}
