package behavioural.strategy;

public interface MoveBehaviour {
    public void move();
}

class Walk implements MoveBehaviour{
    @Override
    public void move() {
        System.out.println("Walking at 9km/h");
    }
}

class Run implements MoveBehaviour{
    @Override
    public void move() {
        System.out.println("Running at 18km/h");
    }
}

