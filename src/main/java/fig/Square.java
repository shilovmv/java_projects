package fig;

public class Square extends Figure {
    private double side;
    private static final String name = "Square";

    public Square(double pSide) {
        this.side = pSide;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double pSide) {
        this.side = pSide;
    }
}
