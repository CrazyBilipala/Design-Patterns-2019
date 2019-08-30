package p02_strategy;

public class StrategyHeroA extends BetterStrategy {
    @Override
    void tricks(Hero hero) {
        hero.qSkill();
        hero.eSkill();
        hero.wSkill();
    }
}
