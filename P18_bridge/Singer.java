package P18_bridge;

import java.util.ArrayList;
import java.util.List;

public class Singer {
    private String name;
    private String country;

    private List<Skill> skills = new ArrayList<>();

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public void showSkills(){
        for (Skill skill:skills){
            System.out.println(this.name + "会" + skill.getName());
        }
    }

    public Singer(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
