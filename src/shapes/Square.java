package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return length * 4;
    }
    public double getArea() {
        return width*2;
    }
}