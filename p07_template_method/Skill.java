package p07_template_method;

public abstract class Skill {
    abstract String skillName();
    abstract int coolDown();
    abstract String buff();
    abstract String deBuff();
    abstract String cost();

    public void desc(){
        System.out.println("技能的名字是："+ skillName());
        System.out.println("技能的冷却时长为："+ coolDown() +"秒");
        System.out.println("技能的增益效果为："+ buff());
        System.out.println("技能的减益效果为："+ deBuff());
        System.out.println("技能的消耗为："+ cost());
    }
}
