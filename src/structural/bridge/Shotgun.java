package structural.bridge;

public class Shotgun implements Gun{
    @Override
    public void fire() {
        System.out.println("non continuous. High impact. high accuracy and low range");
    }
}
