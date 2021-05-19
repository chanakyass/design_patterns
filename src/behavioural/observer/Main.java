package behavioural.observer;

/*
Observer pattern has a State to which observers subscribe for changes initially. Whenever there is a change in the state, observers are notified about the change.
On being notified, observers update their own state based on the change on state of the State object.

When is it useful:
Wherever subscription based model is required. There are two types in this
1) Push model where all changes are pushed to the observers.
2) Pull model where observers themselves ask if there are any changes in the state.
 */

public class Main {
    public static void main(String[] args) {
        State state = new State("Initial State"); 
        for (int i = 0; i < 10; i++) {
            Observer ob = new Observer(state);
            state.registerToState(ob);
        }
        state.changeState("Changed state");
    }
}
