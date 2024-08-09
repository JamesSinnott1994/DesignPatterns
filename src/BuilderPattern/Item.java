package BuilderPattern;

public interface Item {

    /*
    Create an interface Item representing food item and packing.
     */

    public String name();
    public Packing packing();
    public float price();

}
