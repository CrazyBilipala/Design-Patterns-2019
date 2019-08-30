package p05_factory_method;

public class Yellow extends Color {
    private String name = "Yellow";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
