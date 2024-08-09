package BuilderPattern;

public class Bottle implements Packing {

    /*
    Create concrete classes implementing the Packing interface.
     */

    @Override
    public String pack() {
        return "Bottle";
    }

}
