package p12_state;

public class StateManager {
    private int grade;
    private State currentState;

    public StateManager() {
        this.currentState = new FailState();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String handle(){
        return currentState.handle(this);
    }
}
