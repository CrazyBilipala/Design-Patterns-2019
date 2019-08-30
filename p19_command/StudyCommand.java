package p19_command;

public class StudyCommand extends Command {
    public StudyCommand(Student student) {
        super(student);
    }

    @Override
    public void executeStudy() {
        student.study();
    }
}
