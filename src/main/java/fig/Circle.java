package fig;

public class Circle extends Figure {
    private static final String name = "Circle";
    private double radius;

    public Circle(double pRadius) {
        this.radius = pRadius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double pRadius) {
        this.radius = pRadius;
    }
}