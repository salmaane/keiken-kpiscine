import beverages.Beverage;
import beverages.Coffee;
import supplements.Cream;
import supplements.Milk;

public class Main {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();

        System.out.println(coffee.getName());
        System.out.println(coffee.price());

        System.out.println("========= with supplements =============");

        coffee = new Milk(coffee);
        coffee = new Cream(coffee);

        System.out.println(coffee.getName());
        System.out.println(coffee.price());

    }
}