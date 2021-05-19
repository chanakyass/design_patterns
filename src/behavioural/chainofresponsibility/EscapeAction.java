package behavioural.chainofresponsibility;

public class EscapeAction extends Action{

    public EscapeAction(Action action) {
        super(action);
    }

    @Override
    public void process(String action) {
        if(action.equals("ESC")) {
            System.out.println("Close window");
        }
        else{
            super.process(action);
        }
    }
}
