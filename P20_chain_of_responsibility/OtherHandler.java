package P20_chain_of_responsibility;

public class OtherHandler extends Handler {
    @Override
    void handlerRequest(int level) {
        System.out.println("No one can handler");
    }
}
