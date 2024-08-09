package BuilderPattern;

public abstract class Burger implements Item {

    /*
    Create abstract classes implementing the item interface providing default functionalities.
     */

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
