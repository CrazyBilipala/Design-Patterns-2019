package p02_strategy;

public class BetterApp {
    public static void main(String[] args) {
        BetterStrategyContext betterStrategyContext = new BetterStrategyContext(new Ezreal());
        betterStrategyContext.operate("A");
        System.out.println();
    }
}
