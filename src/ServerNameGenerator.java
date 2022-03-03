import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
//Server Name Generator
//
//We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    //1. create two arrays with nouns and adjectives
   static String[] nouns = {"Tomato", "coffee", "Russia", "Dog", "foot", "book", "Roberto", "Orange", "Pepper", "Chicken"};
   static String[] adjectives = {"adorable", "adventurous", "aggressive",
            "amused", "angry", "annoyed",
            "annoying", "anxious", "arrogant",
            "ashamed"};

    public static String randomMaker(String[] randomWord){
        int random = new Random().nextInt(randomWord.length);
        return randomWord[random];
    };

    public static void main(String[] args) {

        System.out.print("server name: ");
        System.out.print(randomMaker(nouns));
        System.out.print("-");
        System.out.print(randomMaker(adjectives));


    }
}
