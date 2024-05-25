package factory;

public class Espresso extends Coffee{

    @Override
    void pourCoffee() {
        System.out.println("Наливается эспрессо");
    }
}
