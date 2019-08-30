package p13_adapter;

public class Assistant implements Target {
    private Singer singer;

    public Assistant(Singer singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        singer.singer();
    }
}
