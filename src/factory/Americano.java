package factory;

public class Americano extends Coffee{

    @Override
    void pourCoffee() {
        System.out.println("Наливается американо");
    }
}
