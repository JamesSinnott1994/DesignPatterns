package BuilderPattern;

public class ChickenBurger extends Burger {

    /*
    Create concrete classes extending Burger and ColdDrink classes
     */

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}