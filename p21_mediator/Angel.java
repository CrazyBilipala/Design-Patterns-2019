package p21_mediator;

public class Angel extends Mediator {
    private Singer jiTai;
    private Singer meiMei;

    public void setJiTai(Singer jiTai) {
        this.jiTai = jiTai;
    }

    public void setMeiMei(Singer meiMei) {
        this.meiMei = meiMei;
    }

    @Override
    void messageHandler(String message, Singer singer) {
//        如果消息来自于鸡太，则通知美美，否则反之
        if (singer == jiTai){
                meiMei.notify(message);
        }else{
            jiTai.notify(message);
        }
    }
}
