public class Person {
    public static void main(String[] args) {

    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("%s says hello!", this.name);
    }

//    Understanding references
//
//The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.
//
//
//Person person1 = new Person("John");
//Person person2 = new Person("John");
//System.out.println(person1.getName().equals(person2.getName()));
//System.out.println(person1 == person2);
//
//Person person1 = new Person("John");
//Person person2 = person1;
//System.out.println(person1 == person2);
//
//Person person1 = new Person("John");
//Person person2 = person1;
//System.out.println(person1.getName());
//System.out.println(person2.getName());
//person2.setName("Jane");
//System.out.println(person1.getName());
//System.out.println(person2.getName());
//Create an input validation class
//
//Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//String getString()
//boolean yesNo()
//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
//
//Bonus
//
//Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.
//
//Circle class
//
//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a private radius field that is set through the constructor, and various methods for getting information about the circle, detailed below.
//
//
//public Circle(double radius)
//public double getArea()
//public double getCircumference()
//Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
//
//The formulas for the circumference and area:
//
//
//circumference = 2 x pi x radius
//area = pi x (radius ^ 2)
//For the value of pi, use the PI constant of the Math class.




}
