import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        //1. Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
//        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 0;
//        while (i <= 15) {
//            System.out.print( " " +i);
//            i++;}

//          B.  Do While
//
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.


//                int i = 0;
//            do {
//                System.out.println( i+2 );
//                i+=2;
//            } while (i <= 100);
//Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println( i-5 );
//           i-=5;
//        } while (i >= -10);
            // //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long k = 2;
//        do {
//            System.out.println(k * k);
//            k *= k;
//        } while(k <= 1000000);

        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 & i % 5==0) {
//                System.out.println("Fizz Buzz");
//            }else if (i % 3 == 0){
//                System.out.println("fizz");
//            }else if (i % 5 ==0){
//                System.out.println("buzz");}
//            else {
//                System.out.println(i);
//            }
//
//            }




//        Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
//        Scanner
//        String leftAlignFormat = "| %-15s | %-4d |%n";
//
//        System.out.format("+-----------------+------+%n");
//        System.out.format("| Column name     | ID   |%n");
//        System.out.format("+-----------------+------+%n");
//        for (int i = 0; i < 5; i++) {
//            System.out.format(leftAlignFormat, "some data" + i, i * i);
//        }
//        System.out.format("+-----------------+------+%n");










//        Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//
//        System.out.print("Do you want to continue? y or n : ");
//        String userInput = scanner.next();
//
//        if (!userInput.equals("y")) {
//            System.out.print("Bye Felicia!");
//        } else {
//            System.out.println();
//            System.out.println("Here is your table!" + "\n");
//            System.out.println("number | squared  | cubed");
//            System.out.println("------ | -------  | -----");
//            for (int i = 1; i <= 3; i++) {
//                System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
//            }
//            for (int i = 4; i <= 9; i++) {
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//            }
//            for (int i = 10; i <= 31; i++) {
//                System.out.println(i + "     | " + (i * i) + "      | " + (i * i * i));
//            }
//            for (int i = 32; i <= 99; i++) {
//                System.out.println(i + "     | " + (i * i) + "     | " + (i * i * i));
//            }
//            for (int i = 100; i <= userInt; i++) {
//                System.out.println(i + "    | " + (i * i) + "    | " + (i * i * i));
//            }
//        }

        //grade letter conversion

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your grade (0-100): ");
//        int userGrade = scanner.nextInt();
//
//        System.out.println("You entered: " + userGrade);
//
//        System.out.print("Do you want to continue? y or n : ");
//        String userInput = scanner.next();
//
//        if (!userInput.equals("y")) {
//            System.out.println("Bye Felicia!");
//        } else {
//            if (userGrade >= 98) {
//                System.out.println("A+");
//            } else if (userGrade >= 88) {
//                System.out.println("A");
//            } else if (userGrade >= 85) {
//                System.out.println("B+");
//            } else if (userGrade >= 80) {
//                System.out.println("B");
//            } else if (userGrade >= 67) {
//                System.out.println("C");
//            } else if (userGrade >= 60) {
//                System.out.println("D");
//            }else {
//                System.out.println("F");
//            }
//        }


    }


    }


