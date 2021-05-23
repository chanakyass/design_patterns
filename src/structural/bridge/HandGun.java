package structural.bridge;

public class HandGun implements Gun{
    private final String name;

    public HandGun(String name) {
        this.name = name;
    }

    @Override
    public void fire() {
        System.out.println("Low range. High accuracy. High impact.");
    }
}
