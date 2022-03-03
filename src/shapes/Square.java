package shapes;

public class Square extends Rectangle {

    int side;

    public Square(int rectLength, int rectWidth, int side) {
        super(rectLength, rectWidth);
        this.side = side;
    }
}
