package p21_mediator;

public class JiTai extends Singer {
    private Mediator mediator;

    public JiTai(String name) {
        super(name);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.messageHandler(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("我是鸡太，我得到了：" + message + " 的消息");
    }
}
