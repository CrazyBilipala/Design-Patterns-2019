package p24_visitor;

public class MeiMei extends Singer {
    @Override
    void sing() {
        System.out.println("美美唱歌");
    }

    @Override
    void accept(Visitor visitor) {
        visitor.meiMeiPlay(this);
    }
}
