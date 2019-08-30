package p03_decorator;

public class QSkill implements   Decorator {
    private String name = "Q技能";


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
