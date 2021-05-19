package behavioural.chainofresponsibility;


public class Chain {
    private final Action chain;

    public Chain(){
        chain = buildChain();
    }

    public Chain(Action chain) {
        this.chain = chain;
    }

    public void process(String action){
        if(chain != null) {
            chain.process(action);
        }
    }

    public Action buildChain(){
        return new EnterAction(new BackspaceAction(new EscapeAction(null)));
    }
}
