package p05_factory_method;

public class Red extends Color {
    private String name = "Red";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
