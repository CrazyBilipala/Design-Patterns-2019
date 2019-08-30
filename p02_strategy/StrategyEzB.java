package p02_strategy;

public class StrategyEzB extends Strategy {
    private Ezreal ezreal = new Ezreal();
    @Override
    void tricks() {
        ezreal.wSkill();
        ezreal.eSkill();
    }
}
