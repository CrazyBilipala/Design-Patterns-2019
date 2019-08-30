package p12_state;

public class App {
    public static void main(String[] args) {
        StateManager stateManager = new StateManager();
        stateManager.setGrade(50);
        System.out.println("level: "+stateManager.handle());
        stateManager.setGrade(60);
        System.out.println("level: "+stateManager.handle());
        stateManager.setGrade(70);
        System.out.println("level: "+stateManager.handle());
        stateManager.setGrade(80);
        System.out.println("level: "+stateManager.handle());
        stateManager.setGrade(87);
        System.out.println("level: "+stateManager.handle());
        stateManager.setGrade(98);
        System.out.println("level: "+stateManager.handle());
    }
}
