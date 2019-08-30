package p05_factory_method;

public class YellowFactory implements IFactory {
    @Override
    public Color factoryCreate() {
        System.out.println("复杂的创建过程...");
        return new Yellow();
    }
}
