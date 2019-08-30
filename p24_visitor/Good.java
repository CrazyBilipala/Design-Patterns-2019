package p24_visitor;

public class Good extends Visitor {
    @Override
    void jiTaiPlay(JiTai jiTai) {
        jiTai.sing();
        System.out.println("鸡太笑了");
    }

    @Override
    void meiMeiPlay(MeiMei meiMei) {
        meiMei.sing();
        System.out.println("美美笑了");
    }
}
