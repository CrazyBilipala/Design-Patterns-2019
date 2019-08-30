package p03_decorator1;

public class WSkill extends     Decorator {
    private String name = "W技能";



    @Override
    public void show() {
        super.show();
        System.out.println("新增" + this.name);
    }
}
