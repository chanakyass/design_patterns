package structural.bridge;

public class General extends Player{

    public General(String name, Gun gun) {
        super(name, gun);
    }

    @Override
    public void shoot() {
        System.out.println("Highly skilled. Experienced veteran. Low risk");
        gun.fire();
    }
}
