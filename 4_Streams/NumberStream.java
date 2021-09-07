import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberStream {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println(sum);


        int sumParallelized =  numbers.parallelStream().mapToInt(number -> number).sum();

        System.out.println(sumParallelized);

        double averageTemp = numbers.parallelStream().mapToInt(number -> number).average().getAsDouble();

        System.out.println(averageTemp);

        List<Integer> squaredNumbers = numbers.stream().map(nomNom -> nomNom * nomNom).collect(Collectors.toList());
        System.out.println(squaredNumbers);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        IntSummaryStatistics summary = numbers
                .parallelStream()
                .mapToInt(number -> number)
                .summaryStatistics();

        System.out.println(summary.getMin());
        System.out.println(summary.getMax());
        // stream af data
        //parallelt
    }

}
