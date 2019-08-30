package p10_observer;

public class App {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserverA a = new ConcreteObserverA(subject);
        ConcreteObserverB b = new ConcreteObserverB(subject);
        subject.attach(a);
        subject.attach(b);

        subject.setAction("warn");
        subject.notice();
    }
}
