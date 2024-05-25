package factory;

public class Main {
    public static void main(String[] args) {

        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        Coffee americano = coffeeFactory.getCoffee(CoffeeType.AMERICANO);

        espresso.pourCoffee();
        americano.pourCoffee();

    }
}
