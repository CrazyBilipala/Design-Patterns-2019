package p03_decorator;

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
        lux.setSkill(qSkill);

        lux.getSkill().show();

    }
}
