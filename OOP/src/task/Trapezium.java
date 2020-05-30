package task;

public class Trapezium implements Figure{
    private double topSide;
    private double leftSide;
    private double rightSide;
    private double bottomSide;
    private Colour colour;

    public Trapezium(double topSide, double leftSide, double rightSide, double bottomSide, Colour colour) {
        this.topSide = topSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
        this.colour = colour;
    }

    public Trapezium() {
        this.topSide = 21;
        this.leftSide = 13;
        this.rightSide = 14;
        this.bottomSide = 36;
        this.colour = Colour.RED;
    }

    public double getHeight(){
        return Math.sqrt(Math.pow(leftSide, 2) - Math.pow(((Math.pow(bottomSide - topSide, 2) + Math.pow(leftSide, 2) - Math.pow(rightSide, 2)) / (2 * (bottomSide - topSide))), 2));
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public void draw() {
        System.out.println("Трапеция нарисована.");
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * getHeight();
    }

    @Override
    public String toString(){
        return "Фигура: трапеция, площадь: " + getArea() + " кв. ед., высота: " + getHeight() + " ед., цвет: " + getColour();
    }
}
