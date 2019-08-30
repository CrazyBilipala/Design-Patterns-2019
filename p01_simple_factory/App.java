package p01_simple_factory;

public class App {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        heroFactory.createHero("Akali").show();
        heroFactory.createHero("Olaf").show();
        heroFactory.createHero("Corki").show();
        heroFactory.createHero("Ezreal").show();
        heroFactory.createHero("Lux").show();
    }
}
