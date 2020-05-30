package task;

public class Circle implements Figure{
    private double radius;
    private Colour colour;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle() {
        this.radius = 5;
        this.colour = Colour.YELLOW;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        System.out.println("Круг нарисован.");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Фигура: круг, площадь: " + getArea() + " кв. ед., радиус: " + getRadius() + " ед., цвет: " + getColour();
    }

}
