import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addNums());
        System.out.println(subNums());
        System.out.println(multiNums());
        System.out.println(divNums());
        System.out.println(modulus());
        System.out.println(getInteger());
    }
//    Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
public static long addNums(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two number to add ");
    long first = sc.nextInt();
    long second = sc.nextInt();
    return  first + second;

}
//Subtraction
public static long subNums(){
    Scanner sc2 = new Scanner(System.in);
    System.out.println("enter two number to subtract ");
    long first = sc2.nextInt();
    long second = sc2.nextInt();
    return  first - second;

}

//Multiplication
public static long multiNums(){
    Scanner sc3 = new Scanner(System.in);
    System.out.println("enter two number to multiply");
    long first = sc3.nextInt();
    long second = sc3.nextInt();
    return  first * second;

}
//Division
public static long divNums(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two number to divide");
    long first = sc.nextInt();
    long second = sc.nextInt();
    return  first / second;

}

//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.


//
//Add a modulus method that finds the modulus of two numbers.
public static long modulus(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two to find remainder");
    long first = sc.nextInt();
    long second = sc.nextInt();
    return  first % second;

}

//
//Food for thought: What happens if we try to divide by zero? What should happen?
//

//2.Create a method that validates that user input is in a certain range
//
//The method signature should look like this:
//
//
public static int getInteger() {
    Scanner sc3 = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = sc3.nextInt();
    if (userInput >= 1 & userInput <= 10) {
        System.out.println("in range");
    } else {
        System.out.println("out of Range");
//
    }
    return getInteger();


}
    // FACTORIAL
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 20: ");
        int userInput = scanner.nextInt();
        if (userInput >= 1 && userInput <= 20) {
            System.out.println("You entered: " + userInput);
            System.out.print("Do you want to continue? (y or n): ");
            String userContinue = scanner.next();
            if (!userContinue.equals("y")) {
                System.out.println("Have an average day.");
            } else {
                long sum = 1;
                for (long i = 1; i <= userInput; i++) {
                    System.out.printf("%d%s%d%n", i, "! = ", (sum *= i));
                }
            }
        } else {
            System.out.println("Your entry is not valid");
        }
    }

//RECURSION

    public static int recursion(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursion(num - 1);
        }
    }

//Game Development 101
//
//Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//The specs for the game are:
//
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.
//  DICE GAME

    public static void dice() {

        Scanner diceGame = new Scanner(System.in);

        System.out.print("How many sides do your dice have? ");
        int diceSides = diceGame.nextInt();

        System.out.print("Would you like to roll the dice? (y/n)  ");
        String roll = diceGame.next();

        boolean diceBoolean = true;

        while (diceBoolean) {
            int randomNum = (int)(Math.random() * diceSides)+1;
            int randomNum2 = (int)(Math.random() * diceSides)+1;
            if (!roll.equals("y")) {
                System.out.println("No dice for you!");
                diceBoolean = false;
            } else {
                System.out.println(randomNum);
                System.out.println(randomNum2);
                System.out.print("Would you like to roll the dice again? (y/n)  ");
                String rollAgain = diceGame.next();
                if(!rollAgain.equals("y")){
                    diceBoolean = false;
                }
            }
        }
    }




}
