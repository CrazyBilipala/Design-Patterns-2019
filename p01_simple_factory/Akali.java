package p01_simple_factory;

public class Akali implements Hero {
    private String name = "Akali";

    @Override
    public void qSkill() {
        System.out.println(this.name + "release q");
    }

    @Override
    public void wSkill() {
        System.out.println(this.name + "release w");
    }

    @Override
    public void eSkill() {
        System.out.println(this.name + "release e");
    }

    @Override
    public void rSkill() {
        System.out.println(this.name + "release r");
    }

    @Override
    public void show() {
        System.out.println(this.name + " is coming!");
    }
}
