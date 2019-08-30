package p05_factory_method;

public class Blue extends Color {
    private String name = "Blue";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
