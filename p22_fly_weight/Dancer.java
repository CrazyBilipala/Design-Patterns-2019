package p22_fly_weight;

public class Dancer implements Star {
    @Override
    public void show(String name) {
        System.out.println("舞手 "+name+" 跳了一段舞蹈");
    }
}
