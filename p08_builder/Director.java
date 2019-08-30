package p08_builder;

public class Director {
    private SkillBuilder skillBuilder;

    public Director(SkillBuilder skillBuilder) {
        this.skillBuilder = skillBuilder;
    }

    public void build(){
         skillBuilder.skillName();
         skillBuilder.coolDown();
         skillBuilder.buff();
         skillBuilder.deBuff();
         skillBuilder.cost();
    }
}
