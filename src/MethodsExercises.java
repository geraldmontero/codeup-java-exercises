import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addNums());
        System.out.println(subNums());
        System.out.println(multiNums());
        System.out.println(divNums());
        System.out.println(modulus());
        System.out.println(getInteger(4,9));
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
public static int getInteger(int min, int max){
     Scanner sc3 = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10: ");
    if (min>0 & max<10){
        System.out.println("in range");
    }
    return min;
}
//and is used like this:
//
//
//
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!
//
//Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//
//
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//
//Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//Use recursion to implement the factorial.
//Create an application that simulates dice rolling.
//
//Ask the user to enter the number of sides for a pair of dice.
//Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//Use static methods to implement the method(s) that generate the random numbers.
//Use the .random method of the java.lang.Math class to generate random numbers.
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





}
