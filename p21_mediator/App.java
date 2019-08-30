package p21_mediator;

public class App {
    public static void main(String[] args) {
//        创建鸡太，美美和angel
        Angel angel = new Angel();
        JiTai jiTai = new JiTai("鸡太");
        MeiMei meiMei = new MeiMei("美美");
//        既然是中介，所以鸡太和angel，美美和angel需要互相认识
        angel.setJiTai(jiTai);
        angel.setMeiMei(meiMei);
        jiTai.setMediator(angel);
        meiMei.setMediator(angel);
//        美美说，鸡太给我买朵花
        meiMei.send("鸡太，给我买朵花");
//        鸡太回应，你太美
        jiTai.send("你太美");
    }
}
