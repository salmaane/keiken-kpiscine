package supplements;

import beverages.Beverage;

public abstract class Supplement extends Beverage {
    protected Beverage beverage;

    public Supplement(Beverage beverage) {
        this.beverage = beverage;
    }

}
