package structural.bridge;

public class MachineGun implements Gun{
    @Override
    public void fire() {
        System.out.println("Shoot continuously. High Impact. Low accuracy. Low Range");
    }
}
