package behavioural.chainofresponsibility;

public class BackspaceAction extends Action {

    public BackspaceAction(Action action) {
        super(action);
    }

    @Override
    public void process(String action) {
        if(action.equals("BACK")) {
            System.out.println("Remove current character");
        }
        else {
            super.process(action);
        }
    }
}
