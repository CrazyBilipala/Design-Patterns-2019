package p02_strategy;

import p01_simple_factory.Akali;
import p01_simple_factory.Corki;
import p01_simple_factory.Lux;
import p01_simple_factory.Olaf;

public class HeroFactory {
    public Hero createHero(String heroName) {
        Hero hero = null;
        switch (heroName) {
            case "Ezreal":
                hero = new Ezreal();
                break;
            default:
        }

        return hero;
    }
}
