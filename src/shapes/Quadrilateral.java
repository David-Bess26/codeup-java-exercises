package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double lengthParam, double widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);
}
