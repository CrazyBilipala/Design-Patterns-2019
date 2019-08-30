package p08_builder;

public class Skill {
    private String skillName;
    private int coolDown;
    private String buff;
    private String deBuff;
    private String cost;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public String getBuff() {
        return buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public String getDeBuff() {
        return deBuff;
    }

    public void setDeBuff(String deBuff) {
        this.deBuff = deBuff;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
