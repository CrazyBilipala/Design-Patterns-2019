package p24_visitor;

public class JiTai extends Singer {
    @Override
    void sing() {
        System.out.println("鸡太唱歌");
    }

    @Override
    void accept(Visitor visitor) {
        visitor.jiTaiPlay(this);
    }
}
