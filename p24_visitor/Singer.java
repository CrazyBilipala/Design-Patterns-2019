package p24_visitor;

public abstract class Singer {
    abstract void sing();

    abstract void accept(Visitor visitor);
}
