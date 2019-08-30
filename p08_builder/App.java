package p08_builder;

public class App {
    public static void main(String[] args) {
        PigSkillBuilder pigSkillBuilder = new PigSkillBuilder();
        Director director = new Director(pigSkillBuilder);
        director.build();
        Skill skill = pigSkillBuilder.build();
        System.out.println(skill.getCoolDown());
    }

}
