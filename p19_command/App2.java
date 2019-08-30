package p19_command;

public class App2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student ming = new Student("小明");
        Student wang = new Student("小王");
//        下达给小明同学的命令
        StudyCommand mingStudyCommand = new StudyCommand(ming);
//        下达给小王同学的命令
        StudyCommand wangStudyCommand = new StudyCommand(wang);
//        老师下达指令给小明，并且重要的事情说三遍。
        teacher.request(mingStudyCommand);
        teacher.request(mingStudyCommand);
        teacher.request(mingStudyCommand);
//        老师下达指令给小王，并且重要的事情说三遍。
        teacher.request(wangStudyCommand);
        teacher.request(wangStudyCommand);
        teacher.request(wangStudyCommand);
//      但是小王偷偷看了下手机，漏了一次
        teacher.undo(wangStudyCommand);
//        听老师的话开始学习
        teacher.execute();

    }
}
