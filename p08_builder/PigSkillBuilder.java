package p08_builder;

public class PigSkillBuilder extends SkillBuilder {

    private PigSkill pigSkill = new PigSkill();
    @Override
    Skill build() {
        return pigSkill;
    }

    @Override
    void skillName() {
        System.out.println("复杂的取名字过程...");
        pigSkill.setSkillName("万猪攻塔");

    }

    @Override
    void coolDown() {
        System.out.println("复杂的冷却时间评估过程...");
        pigSkill.setCoolDown(7);
    }

    @Override
    void buff() {
        System.out.println("复杂的buff评估过程...");
        pigSkill.setBuff("对防御塔造成777固定伤害");
    }

    @Override
    void deBuff() {
        System.out.println("复杂的deBuff评估过程...");
        pigSkill.setDeBuff("施展技能7秒内移速下降");
    }

    @Override
    void cost() {
        System.out.println("复杂的消耗评估过程...");
        pigSkill.setCost("消耗100点怒气");
    }
}
