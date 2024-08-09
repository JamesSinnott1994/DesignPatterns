package BuilderPattern;

public class Coke extends ColdDrink {

    /*
    Create concrete classes extending Burger and ColdDrink classes
     */

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
