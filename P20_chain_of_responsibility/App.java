package P20_chain_of_responsibility;

public class App {
    public static void main(String[] args) {
//        实例化处理类
        Handler handler1 = new OneHandler();
        Handler handler2 = new TwoHandler();
        Handler handler3 = new ThreeHandler();
        Handler handlerOther = new OtherHandler();
//        构建职责链
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler3.setSuccessor(handlerOther);
//        执行
        handler1.handlerRequest(3);
        handler1.handlerRequest(2);
        handler1.handlerRequest(1);
        handler1.handlerRequest(7);
    }
}
