package p13_adapter;

public class App {
    public static void main(String[] args) {
        Singer jitai = new Singer();
        Assistant meimei = new Assistant(jitai);
        Target target = meimei;
//        Target target = new Assistant(jitai);
        target.sing();
    }
}
