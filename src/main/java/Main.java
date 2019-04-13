import abstractfactory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.createFactory(null);
    }
}
