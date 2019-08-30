package p22_fly_weight;

public class App {
    public static void main(String[] args) {
//        明星工厂成立了
        WorkShop workShop = new WorkShop();
//        培训了两个歌手一个舞手
        Star jiTai = workShop.up("singer");
        Star meiMei = workShop.up("singer");
        Star ming = workShop.up("dancer");
//        明星们开始表演
        jiTai.show("鸡太");
        meiMei.show("美美");
        ming.show("小明");
//        由于鸡太和美美都是一个模式出来的歌手，所以是同一个类
        System.out.println(jiTai == meiMei);
//        由于鸡太和小明不是一个模式出来的明星，所以不是同一个类
        System.out.println(jiTai == ming);

    }
}
