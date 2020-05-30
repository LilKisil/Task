package task;

public class RandomFigure {
    private Figure [] arrayOfFigures;

    public RandomFigure() {
        this.arrayOfFigures = new Figure[1 + (int) ( Math.random() * 10)];
    }


    public void printFigures(){
        for (int i = 0; i < arrayOfFigures.length; i++) {
            System.out.println(arrayOfFigures[i].toString());
        }
    }

    public void makeArrayOfFigures(){
        for (int i = 0; i < arrayOfFigures.length; i++) {
            switch (1 + (int) ( Math.random() * 4)){
                case 1:
                    arrayOfFigures[i] = new Square(makeRandomNumber(10), makeRandomColour());
                    break;
                case 2:
                    arrayOfFigures[i] = new Triangle(makeRandomNumber(15), makeRandomNumber(5), makeRandomColour());
                    break;
                case 3:
                    arrayOfFigures[i] = new Circle(makeRandomNumber(6), makeRandomColour());
                    break;
                case 4:
                    arrayOfFigures[i] = new Trapezium();
                    break;
            }
        }
    }

    public int makeRandomNumber(int number){
        return 1 + (int) ( Math.random() * number);
    }

    public Colour makeRandomColour(){
        Colour [] arrayOfColour = {Colour.BLACK, Colour.WHITE, Colour.GREEN, Colour.RED, Colour.PINK, Colour.YELLOW, Colour.BLUE, Colour.GREY, Colour.BROWN};
        return arrayOfColour[(int) ( Math.random() * arrayOfColour.length)];
    }

    public Figure[] getArrayOfFigures() {
        return arrayOfFigures;
    }

    public void setArrayOfFigures(Figure[] arrayOfFigures) {
        this.arrayOfFigures = arrayOfFigures;
    }
}
