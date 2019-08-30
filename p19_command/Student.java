package p19_command;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(this.name+"开始学习");
    }
}
