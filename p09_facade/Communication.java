package p09_facade;

public class Communication {
    public void start(){
        System.out.println("开始建立与世界的通信");
    }
    public void connect(String phoneNumber){
        System.out.println("通过号码："+phoneNumber+"建立双工连接");
    }
    public void deJam(){
        System.out.println("开启干扰降低模式");
    }
    public void end(){
        System.out.println("通话已连接，可以开始响铃");
    }
}
