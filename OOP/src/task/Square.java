package task;

public class Square implements Figure{
    private double side;
    private Colour colour;

    public Square() {
        this.side = 5;
        this.colour = Colour.BLACK;
    }

    public Square(double side, Colour colour) {
        this.side = side;
        this.colour = colour;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
        System.out.println("Квадрат нарисован.");
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString(){
        return "Фигура: квадрат, площадь: " + getArea() + " кв. ед., длина стороны: " + getSide() + " ед., цвет: " + getColour();
    }
}
