package p03_decorator1;

public class QSkill extends Decorator {
    private String name = "Q技能";



    @Override
    public void show() {
        super.show();
        System.out.println("新增" + this.name);
    }
}
