package beverages;

public abstract class Beverage {
    protected String name;
    public String getName() {
        return name;
    }

    public abstract Double price();
}
