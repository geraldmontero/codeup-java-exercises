package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    protected static int rectLength ;
//    protected static  int rectWidth ;
//
//    // Define a constructor that accepts two numbers for length and width, and sets those properties
//    public Rectangle(int rectLength, int rectWidth) {
//        this.rectLength = rectLength;
//        this.rectWidth = rectWidth;
//    }
//
//    // Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values
//    static int getArea() {
//        return rectLength * rectWidth;
//    }
//
//    static int getPerimeter() {
//        return (2 * rectLength) + (2 * rectWidth);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("getArea() = " + getArea());
//        System.out.println("getPerimeter() = " + getPerimeter());
//    }
//
//
//    //getArea()
//    //getPerimeter
//    //perimeter = 2 x length + 2 x width
//    //area = length x width
}
