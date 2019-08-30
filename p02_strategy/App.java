package p02_strategy;

public class App {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.operate("A");
        System.out.println();
        strategyContext.operate("B");
        System.out.println();
        strategyContext.operate("C");
        System.out.println();
    }
}
