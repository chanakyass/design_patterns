package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class State {
    private  String stateToObserve;
    private  List<Observer> observers;

    public State(String stateToObserve) {
        this.stateToObserve = stateToObserve;
        this.observers = new ArrayList<>();
    }


    public String getStateToObserve() {
        return this.stateToObserve;
    }


    protected List<Observer> getObservers() {
        return this.observers;
    }

    public void setStateToObserve(String stateToObserve) {
        this.stateToObserve = stateToObserve;
    }
    protected void setObservers(List<Observer> observers) {
        this.observers = observers;
    }


    public void changeState(String changedState){
        this.setStateToObserve(changedState);
        notifyObservers();
    }

    public void notifyObservers(){
        observers.forEach(Observer::update);

    }

    public void registerToState(Observer observer) {
        observers.add(observer);
    }
    
    
}