package structural.bridge;

public class HandGun implements Gun{
    @Override
    public void fire() {
        System.out.println("Low range. High accuracy. High impact.");
    }
}
