package p03_decorator1;

public class App {
    public static void main(String[] args) {
        Lux lux = new Lux();
        ASkill aSkill = new ASkill();
        QSkill qSkill = new QSkill();
        WSkill wSkill = new WSkill();
        ESkill eSkill = new ESkill();
        RSkill rSkill = new RSkill();


        aSkill.equip(qSkill);
        qSkill.equip(wSkill);
        wSkill.equip(eSkill);
        eSkill.equip(rSkill);
        rSkill.equip(new Skill());
        lux.setSkill(aSkill);

        lux.getSkill().show();

    }
}
