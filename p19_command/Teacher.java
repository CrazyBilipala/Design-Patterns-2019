package p19_command;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Command> commands = new ArrayList<>();

    public void request(Command command){
        commands.add(command);
    }

    public void undo(Command command){
        commands.remove(command);
    }

    public void execute(){
        for (Command command:commands){
            command.executeStudy();
        }
    }
}
