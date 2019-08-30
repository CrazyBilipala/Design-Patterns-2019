package p12_state;

public class FailState implements State {

    private String level = "不及格";


    @Override
    public String handle(StateManager stateManager) {
        if (stateManager.getGrade()>=60){
            stateManager.setCurrentState(new PassState());
            return stateManager.handle();
        }else {
            return level;
        }
    }
}
