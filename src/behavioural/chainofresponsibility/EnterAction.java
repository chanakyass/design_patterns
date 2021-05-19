package behavioural.chainofresponsibility;

public class EnterAction extends Action{

    public EnterAction(Action action) {
        super(action);
    }

    @Override
    public void process(String action) {
        if(action.equals("ENTER")) {
            System.out.println("Go to next line");
        }
        else{
            super.process(action);
        }
    }
}
