package p03_decorator1;

public class Decorator implements ISkill {

    private ISkill skill;

    public void equip(ISkill skill){
        this.skill = skill;
    }

    @Override
    public void show() {
       if (skill!=null){
           skill.show();
       }
    }
}
