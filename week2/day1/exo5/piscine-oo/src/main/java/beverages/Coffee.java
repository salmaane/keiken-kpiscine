package beverages;

public class Coffee extends Beverage {

    public Coffee() {
        name = "Coffee";
    }

    @Override
    public Double price() {
        return 6d;
    }
}
