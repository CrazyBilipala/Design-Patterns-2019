package p19_command;

public abstract class Command {
    public Student student;

    public Command(Student student) {
        this.student = student;
    }

    abstract public void executeStudy();
}
