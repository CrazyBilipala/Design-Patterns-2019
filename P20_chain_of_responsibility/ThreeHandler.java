package P20_chain_of_responsibility;

public class ThreeHandler extends Handler {
    @Override
    void handlerRequest(int level) {
        if (level == 3){
            System.out.println("Level 3");
            System.out.println("ThreeHandler.handlerRequest");
            System.out.println("can handler");
        }else {
            successor.handlerRequest(level);
        }
    }
}
