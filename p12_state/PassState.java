package p12_state;

public class PassState implements State {

    private String level = "及格";


    @Override
    public String handle(StateManager stateManager) {
        if (stateManager.getGrade()>=80){
            stateManager.setCurrentState(new GoodState());
            return stateManager.handle();
        }else {
            return level;
        }
    }
}
