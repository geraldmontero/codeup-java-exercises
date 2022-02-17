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
        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 0;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;

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

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 1) {   System.out.println("Fizz");
            }else {if (i % 5 == 1){
                System.out.println("Buzz");
            }else {
                System.out.println(i);}

            }

        }


//        Display a table of powers.
//
//Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.




    }


    }


