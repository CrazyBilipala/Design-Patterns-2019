package p03_decorator1;

public class ASkill extends Decorator {

    private String name = "A技能";

    @Override
    public void show() {
        super.show();
        System.out.println("新增"+this.name);
    }
}
