package p05_factory_method;

public class App {
    public static void main(String[] args) {
        RedFactory redFactory = new RedFactory();
        Color red = redFactory.factoryCreate();
        System.out.println(red.getName());

        YellowFactory yellowFactory = new YellowFactory();
        Color yellow = yellowFactory.factoryCreate();
        System.out.println(yellow.getName());

        BlueFactory blueFactory = new BlueFactory();
        Color blue = blueFactory.factoryCreate();
        System.out.println(blue.getName());

    }
}
