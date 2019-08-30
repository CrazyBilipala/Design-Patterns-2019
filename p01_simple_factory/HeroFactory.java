package p01_simple_factory;

public class HeroFactory {
    public Hero createHero(String heroName) {
        Hero hero = null;
        switch (heroName) {
            case "Akali":
                hero = new Akali();
                break;
            case "Olaf":
                hero = new Olaf();
                break;
            case "Corki":
                hero = new Corki();
                break;
            case "Ezreal":
                hero = new Ezreal();
                break;
            case "Lux":
                hero = new Lux();
                break;
            default:
        }

        return hero;
    }
}
