package structural.bridge;

public class MachineGun implements Gun{
    private final String name;

    public MachineGun(String name) {
        this.name = name;
    }

    @Override
    public void fire() {
        System.out.println("Shoot continuously. High Impact. Low accuracy. Low Range");
    }
}
