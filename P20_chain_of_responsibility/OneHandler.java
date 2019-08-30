package P20_chain_of_responsibility;

public class OneHandler extends Handler {
    @Override
    void handlerRequest(int level) {
        if (level == 1){
            System.out.println("Level 1");
            System.out.println("OneHandler.handlerRequest");
            System.out.println("can handler");
        }else {
            successor.handlerRequest(level);
        }
    }
}
