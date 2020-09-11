package shapes;

class Circle {
    private static double radius;

    public Circle(double radius) {
        Circle.radius = radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return (2 * Math.PI * radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}