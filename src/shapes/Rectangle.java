package shapes;

public class Rectangle {

    protected static int rectLength ;
    protected static  int rectWidth ;

    // Define a constructor that accepts two numbers for length and width, and sets those properties
    public Rectangle(int rectLength, int rectWidth) {
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    // Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values
    static int getArea() {
        return rectLength * rectWidth;
    }

    static int getPerimeter() {
        return (2 * rectLength) + (2 * rectWidth);
    }

    public static void main(String[] args) {
        System.out.println("getArea() = " + getArea());
        System.out.println("getPerimeter() = " + getPerimeter());
    }


    //getArea()
    //getPerimeter
    //perimeter = 2 x length + 2 x width
    //area = length x width
}
