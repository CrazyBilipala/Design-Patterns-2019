package p21_mediator;

public class MeiMei extends Singer {

    private Mediator mediator;

    public MeiMei(String name) {
        super(name);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.messageHandler(message,this);
    }

    @Override
    public void notify(String message) {
        System.out.println("我是美美，我得到了：" + message + " 的消息");
    }
}
