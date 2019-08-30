package p03_decorator;

public class WSkill implements    Decorator {
    private String name = "W技能";


    private ISkill skill;

    @Override
    public void equip(ISkill skill) {
        this.skill = skill;
    }

    @Override
    public void show() {
        if (skill!=null){
            skill.show();
        }
        System.out.println("新增"+this.name);
    }
}
