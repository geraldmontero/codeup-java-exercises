import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        String question = "Sure.";
        String exclaim = "Whoa, chill out!";
        String empty = "Fine. Be that way!";
        String other = "Whatever";
        Scanner scanner = new Scanner(System.in);
        String keepTalking;


        do {
            System.out.print("Start convo :  ");
            String userInput = scanner.nextLine();
//        System.out.println(userInput);

            if (userInput.contains("?")) {
                System.out.println(question);


            } else if (userInput.contains("!")) {
                System.out.println(exclaim);
            } else if (userInput.equals("")) {
                System.out.println(empty);
            } else  {
                System.out.println(other);
            }
            System.out.println("continue?");
            keepTalking= scanner.nextLine();
        }while (keepTalking.equalsIgnoreCase("y"));

    }
}
