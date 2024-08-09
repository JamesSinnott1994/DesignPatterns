package BuilderPattern;

public class Wrapper implements Packing {

    /*
    Create concrete classes implementing the Packing interface.
     */

    @Override
    public String pack() {
        return "Wrapper";
    }

}
