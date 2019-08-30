package p03_decorator1;

public class ESkill extends    Decorator {
    private String name = "E技能";



    @Override
    public void show() {
        super.show();
        System.out.println("新增" + this.name);
    }
}
