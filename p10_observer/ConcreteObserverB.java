package p10_observer;

public class ConcreteObserverB implements Observer {
    private ConcreteSubject concreteSubject;

    public ConcreteObserverB(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        System.out.println("观察者B发现主题发生了变化，当前内容为："+ concreteSubject.getAction());
    }
}
