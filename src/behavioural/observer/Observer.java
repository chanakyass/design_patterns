package behavioural.observer;

public class Observer {
    private State state;


    public Observer(State state) {
        this.state = state;
    }


    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void update() {
        String changedState = getState().getStateToObserve();
        System.out.println("State has been changed to: " + changedState);
    }
}
