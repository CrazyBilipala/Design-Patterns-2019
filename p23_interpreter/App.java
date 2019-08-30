package p23_interpreter;

public class App {
    public static void main(String[] args) {
//        构建上下文，本案例中是设置要加密的明文
        Context context = new Context("明文");
//        分别声明不同的解释器（负责加密）
        Password easyPassword = new EasyPassword();
        Password normalPassword = new NormalPassword();
//        注意是引用传递，所以最终会影响到context对象
        easyPassword.encryption(context);
        System.out.println(context.getTarget());
//        注意是引用传递，所以最终会影响到context对象
        normalPassword.encryption(context);
        System.out.println(context.getTarget());
    }
}
