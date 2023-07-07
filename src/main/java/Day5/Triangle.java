package Day5;

public class Triangle implements Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double aSideOne, double aSideTwo, double aSideThree) {
        this.sideOne = aSideOne;
        this.sideTwo = aSideTwo;
        this.sideThree = aSideThree;
    }

    public void setSideOne(double value) {
        this.sideOne = value;
    }

    public void setSideTwo(double value) {
        this.sideTwo = value;
    }

    public void setSideThree(double value) {
        this.sideThree = value;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    @Override
    public double calculateArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;

        return Math.sqrt(p * ((p - sideOne) * (p - sideTwo) * (p - sideThree)));
    }

    @Override
    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
