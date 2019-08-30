package P20_chain_of_responsibility;

public abstract class Handler {
    public Handler successor;

    public void setSuccessor(Handler handler){
        this.successor = handler;
    }

    abstract void handlerRequest(int level);
}
