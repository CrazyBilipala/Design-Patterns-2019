package p17_singleton;

public class Faker {

    private static Faker faker;

    private Faker(){

    }

    public static Faker getInstance(){
        if (faker == null){
            faker = new Faker();
        }
        return faker;
    }
}
