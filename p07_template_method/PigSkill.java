package p07_template_method;

public class PigSkill extends Skill {
    @Override
    String skillName() {
        return "万猪攻塔";
    }

    @Override
    int coolDown() {
        return 7;
    }

    @Override
    String buff() {
        return "对防御塔造成777固定伤害";
    }

    @Override
    String deBuff() {
        return "施展技能7秒内移速下降";
    }

    @Override
    String cost() {
        return "消耗100点怒气";
    }
}
