package p04_proxy;

public class Proxy implements Contract {

    private String role = "助理";

    private Celebrity celebrity;

//    确定为哪位明星代理
    public Proxy(Celebrity celebrity) {
        this.celebrity = celebrity;
    }

    @Override
    public void sing() {
        System.out.println(this.role+" :安排行程");
        System.out.println(this.role+" :购买机票");
//        唱歌还是得明星来
        celebrity.sing();

        System.out.println(this.role+" :安排专车回酒店");
    }
}
