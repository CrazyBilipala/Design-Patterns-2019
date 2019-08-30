package p02_strategy;

public class StrategyEzA extends Strategy {
    private Ezreal ezreal = new Ezreal();
    @Override
    void tricks() {
        ezreal.qSkill();
        ezreal.eSkill();
        ezreal.wSkill();
    }
}
