package p17_singleton;

public class Lazy {
    private volatile static Lazy lazy;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }

        return lazy;
    }
}
