import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        String name = "Pie";
//        System.out.printf("The value of pi is approximately",+ pi);
        System.out.print("enter and interger: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 3 word:");
//        String userIn = scanner.next();
//        String userIn2 = scanner.next();
//        String userIn3 = scanner.next();
//
//        System.out.printf(userIn + "%n" + userIn2 + "%n" + userIn3);

        //3. Prompt the user to enter a sentence
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = sc.nextLine();
        System.out.println("you just worte : " + sentence);


        // calculate perimeter of classroom
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("enter the length of your room:  ");
        String userLength = scanner2.nextLine();

        System.out.println("enter the width of your room : ");
        String userWidth = scanner2.nextLine();

        System.out.println("enter the height of your room : ");
        String userHeight = scanner2.nextLine();
        float userLengthInt = Float.parseFloat(userLength);

        float userWidthInt = Float.parseFloat(userWidth);

        float userHeightInt = Float.parseFloat(userHeight);

        System.out.printf("the area of your room is : %.2f%s%n" , (userLengthInt * userWidthInt), "square feet.");
        System.out.printf("the perimeter of your room is : %.2f%s%n" , ((userLengthInt * 2) + (userWidthInt *2 ) ), " feet.");
        System.out.printf("the volume of your room is : %.2f%s%n" , (userLengthInt * userWidthInt * userHeightInt), " cubic feet.");

        scanner2.useDelimiter("\n");




    }



}
