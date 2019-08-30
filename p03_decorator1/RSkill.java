package p03_decorator1;

public class RSkill extends Decorator {
    private String name = "R技能";


    @Override
    public void show() {
        super.show();
        System.out.println("新增" + this.name);
    }
}
