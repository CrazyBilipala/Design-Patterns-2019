package p02_strategy;

public class BetterStrategyContext {
    private BetterStrategy betterStrategy;

    private Hero hero;

    public BetterStrategyContext(Hero hero) {
        this.hero = hero;
    }

    public void operate(String tricksName) {
        switch (tricksName) {
            case "A":
                betterStrategy = new StrategyHeroA();
                break;
            default:
                betterStrategy = null;
        }
        if (betterStrategy != null) {
            betterStrategy.tricks(hero);
        } else {
            System.out.println("没有这个套路");
        }
    }
}
