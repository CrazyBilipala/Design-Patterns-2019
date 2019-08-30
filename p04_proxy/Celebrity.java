package p04_proxy;

public class Celebrity implements Contract {

    private String role = "明星";


    @Override
    public void sing() {
        System.out.println(this.role+" :唱歌");
    }
}
