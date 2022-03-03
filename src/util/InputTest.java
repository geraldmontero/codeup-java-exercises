package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String myString = input.getString();
        System.out.println("myString = " + myString);

        System.out.println("do you like coding");
        boolean likeCoding = input.yesNo();
        System.out.println("likeCoding = " + likeCoding);

        System.out.println("please enter a whole number. ");
        int myInt = input.getInt();
        System.out.println("myInt = " + myInt);

        int myint2 = input.getInt(1,100);
        System.out.println("myInt2 = " + myint2);

        System.out.println("Please enter a decimal number");
        double myDouble = input.getDouble();
        System.out.println("myDouble = " + myDouble);


    }
}
