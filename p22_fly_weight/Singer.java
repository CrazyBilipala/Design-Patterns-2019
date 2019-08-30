package p22_fly_weight;

public class Singer implements Star {
    @Override
    public void show(String name) {
        System.out.println("歌手 "+name +" 唱了一首歌");
    }
}
