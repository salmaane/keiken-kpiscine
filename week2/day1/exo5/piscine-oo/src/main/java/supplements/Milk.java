package supplements;

import beverages.Beverage;

public class Milk extends Supplement {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " with milk";
    }

    @Override
    public Double price() {
        return 2d + beverage.price();
    }
}