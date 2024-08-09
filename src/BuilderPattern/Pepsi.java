package BuilderPattern;

public class Pepsi extends ColdDrink {

    /*
    Create concrete classes extending Burger and ColdDrink classes
     */

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
