package P20_chain_of_responsibility;

public class TwoHandler extends Handler {
    @Override
    void handlerRequest(int level) {
        if (level == 2){
            System.out.println("Level 2");
            System.out.println("TwoHandler.handlerRequest");
            System.out.println("can handler");
        }else {
            successor.handlerRequest(level);
        }
    }
}
