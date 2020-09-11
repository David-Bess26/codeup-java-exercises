package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double lengthParam, double widthParam) {
        super(lengthParam, widthParam);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }




}
