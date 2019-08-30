package p12_state;

public class ExcellentState implements State {

    private String level = "优秀";


    @Override
    public String handle(StateManager stateManager) {
        if (stateManager.getGrade()>=90){
            return level;
        }
        return null;
    }
}
