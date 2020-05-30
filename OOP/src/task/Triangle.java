package task;
//Прямоугольный треугольник судя по условию
public class Triangle implements Figure{
    private double firstSide;
    private double secondSide;
    private Colour colour;

    public Triangle() {
        this.firstSide = 3;
        this.secondSide = 4;
        this.colour = Colour.WHITE;
    }

    public Triangle(double firstSide, double secondSide, Colour colour) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.colour = colour;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }


    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
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
        System.out.println("Треугольник нарисован.");
    }

    @Override
    public double getArea() {
        return 1.0 / 2.0 * firstSide * secondSide;
    }

    @Override
    public String toString(){
        return "Фигура: треугольник, площадь: " + getArea() + " кв. ед., гипотенуза: " + getHypotenuse() + " ед., цвет: " + getColour();
    }

}
