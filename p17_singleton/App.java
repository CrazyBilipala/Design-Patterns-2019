package p17_singleton;

public class App {
    public static void main(String[] args) {
        FakerThread fakerThread1 = new FakerThread();
        FakerThread fakerThread2 = new FakerThread();
//        输出的结果不同，说明在多线程下，无法提供单例
        fakerThread1.start();
        fakerThread2.start();

        HungryThread hungryThread1 = new HungryThread();
        HungryThread hungryThread2 = new HungryThread();
//        相同的结果，可稳定提供单例
        hungryThread1.start();
        hungryThread2.start();

        LazyThread lazyThread1 = new LazyThread();
        LazyThread lazyThread2 = new LazyThread();
//        相同的结果，可稳定提供单例
        lazyThread1.start();
        lazyThread2.start();
    }
}

class FakerThread extends Thread {
    @Override
    public void run() {
        System.out.println(Faker.getInstance().toString());
    }
}

class HungryThread extends Thread {
    @Override
    public void run() {
        System.out.println(Hungry.getInstance().toString());
    }
}

class LazyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Lazy.getInstance().toString());
    }
}