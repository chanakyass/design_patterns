package behavioural.chainofresponsibility;

public abstract class Action {
    private final Action action;

    public Action(Action action) {
        this.action = action;
    }

    void process(String strAction){
        if(action != null){
            action.process(strAction);
        }
    }
}
