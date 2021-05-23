package behavioural.strategy;

public interface MoveBehaviour {
    public void move();
}

//Robot will walk to amalgamate among civilians

class Walk implements MoveBehaviour{
    @Override
    public void move() {
        System.out.println("Walking at 9km/h");
    }
}

//Robot will run when there are enemies.

class Run implements MoveBehaviour{
    @Override
    public void move() {
        System.out.println("Running at 18km/h");
    }
}

