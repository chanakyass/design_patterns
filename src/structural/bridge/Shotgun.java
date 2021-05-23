package structural.bridge;

public class Shotgun implements Gun{

    private final String name;

    public Shotgun(String name) {
        this.name = name;
    }

    @Override
    public void fire() {
        System.out.println("non continuous. High impact. high accuracy and low range");
    }
}
