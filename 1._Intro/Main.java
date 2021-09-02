import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {

  /*     Word[] words = new Word[]{
    //            new Word("Bord"),
      //          new Word("Stol")
        //};

        //Systemos.out.println(words);*/

        ArrayList<Word> animals = new ArrayList<>(){{
            add(new Word("Tiger"));
            add(new Word("Løve"));
        }};

        System.out.println(animals);
    }
}
