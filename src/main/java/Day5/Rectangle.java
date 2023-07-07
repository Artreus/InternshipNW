package Day5;

public class Rectangle implements Shape {
    private double sideLength;
    private double sideWidth;

    public Rectangle (double aSideLength, double aSideWidth) {
        this.sideLength = aSideLength;
        this.sideWidth = aSideWidth;
    }

    public void setSideLength(double value) {
        this.sideLength = value;
    }

    public void setSideWidth (double value) {
        this.sideWidth = value;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getSideWidth() {
        return sideWidth;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideWidth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideLength + sideWidth);
    }
}
