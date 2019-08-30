package p02_strategy;

public class StrategyContext {
    private Strategy strategy;

    public void operate(String tricksName) {
        switch (tricksName) {
            case "A":
                strategy = new StrategyEzA();
                break;
            case "B":
                strategy = new StrategyEzB();
                break;
            case "C":
                strategy = new StrategyEzC();
                break;
            default:
                strategy = null;
        }
        if (strategy != null) {
            strategy.tricks();
        } else {
            System.out.println("没有这个套路");
        }
    }
}
