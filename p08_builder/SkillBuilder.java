package p08_builder;

public abstract class SkillBuilder {
    abstract Skill build();
    abstract void skillName();
    abstract void coolDown();
    abstract void buff();
    abstract void deBuff();
    abstract void cost();
}
