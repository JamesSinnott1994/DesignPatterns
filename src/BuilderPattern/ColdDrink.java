package BuilderPattern;

public abstract class ColdDrink implements Item {

    /*
    Create abstract classes implementing the item interface providing default functionalities.
     */

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
