package supplements;

import beverages.Beverage;

public class Cream extends Supplement {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " with Cream";
    }

    @Override
    public Double price() {
        return 1d + beverage.price();
    }
}