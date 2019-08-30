package p21_mediator;

public abstract class Singer {
    public String name;

    public Singer(String name) {
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void notify(String message);
}
