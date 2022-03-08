package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;



     public Input() {
         scanner = new Scanner(System.in);
     };
     public String getString(){
         System.out.println("Enter a String");
         return scanner.nextLine();
     };


        boolean yesNo(){
            String userInput = scanner.next();
            return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        };
        int getInt(int min, int max){
            int userInt;
            do {
                System.out.printf("enter a number between %d and %d ", min, max);
                userInt = this.scanner.nextInt();
            } while (userInt > max || userInt < min);
            return userInt;
        }
        int getInt(){
            return this.scanner.nextInt();

        }
        public double getDouble(double min, double max){
            Double userDouble;
            do{
                System.out.printf("please enter a decimal between %f and %f: %n", min,max);
                userDouble =this.scanner.nextDouble();
            }while (userDouble > max || userDouble < min);
            return userDouble;


        }
       public double getDouble(){
            return this.scanner.nextDouble();

        }

Integer.valueOf(String s);
Double.valueOf(String s);

}
