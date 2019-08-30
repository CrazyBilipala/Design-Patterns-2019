package p04_proxy;

public class App {
    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity();
        Proxy proxy = new Proxy(celebrity);
        proxy.sing();
    }
}
