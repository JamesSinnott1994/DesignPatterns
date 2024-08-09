package BuilderPattern;

public class VegBurger extends Burger {

    /*
    Create concrete classes extending Burger and ColdDrink classes
     */

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }

}
