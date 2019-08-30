package p24_visitor;

public class Fail extends Visitor {
    @Override
    void jiTaiPlay(JiTai jiTai) {
        jiTai.sing();
        System.out.println("鸡太哭了");
    }

    @Override
    void meiMeiPlay(MeiMei meiMei) {
        meiMei.sing();
        System.out.println("美美哭了");
    }
}
