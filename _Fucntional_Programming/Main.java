import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        AbstractClass abstractClassImplemented = new AbstractClass() {
            @Override
            public void makeSurreal() {
                // super.makeSurreal(); // virker ik. Lav anonym klasse
                System.out.println("Created by Dali");
            }

        }; // læg mærke til semicolon < } når Abstractclass bliver instatieret og der dannes anonym klasse. in line

        Comparator<String> stringComparator = new Comparator<String>() { //linje 15 er inline implementeret. Functionel interface
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };

        stringComparator.compare("Hello", "world"); //kalder ikke kun metoden, men anonym klasse instatieret

        Comparator<String> stringComparatorLambda = (firstString, secondString) -> firstString.compareTo(secondString);
        //linje 24 er det samme som linje 15-20
        System.out.println(stringComparatorLambda.compare("a", "b"));

        Concatenator concat = (firstString, secondString) -> firstString + secondString;
        System.out.println(concat.cat("Kk", "LL"));
    }


}

