package p10_observer;

public class ConcreteObserverA implements Observer {
    private ConcreteSubject concreteSubject;

    public ConcreteObserverA(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        System.out.println("观察者A发现主题发生了变化，当前内容为："+ concreteSubject.getAction());
    }
}
