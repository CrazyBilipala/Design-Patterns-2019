package p12_state;

public class GoodState implements State {

    private String level = "良好";


    @Override
    public String handle(StateManager stateManager) {
        if (stateManager.getGrade()>=90){
            stateManager.setCurrentState(new ExcellentState());
            return stateManager.handle();
        }else {
            return level;
        }
    }
}
