package beverages;

public class Tea extends Beverage {
    public Tea() {
        name = "Tea";
    }

    @Override
    public Double price() {
        return 5d;
    }
}
