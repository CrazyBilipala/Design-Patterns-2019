package p02_strategy;

public class StrategyEzC extends Strategy {
    private Ezreal ezreal = new Ezreal();
    @Override
    void tricks() {
        ezreal.qSkill();
        ezreal.rSkill();
    }
}
