package p24_visitor;

public class App {
    public static void main(String[] args) {
//        实例化鸡太和美美
        Singer jiTai = new JiTai();
        Singer meiMei = new MeiMei();
//        实例化高层操作类，用以统一操纵歌手的行为
        OperateObject operateObject = new OperateObject();
//        鸡太和美美加入高层类
        operateObject.add(jiTai);
        operateObject.add(meiMei);
//        观众给了差评
        Visitor fail = new Fail();
//        歌手给出的反应
        operateObject.operate(fail);
//        观众给了好评
        Visitor good = new Good();
//        歌手的反应
        operateObject.operate(good);
    }
}
