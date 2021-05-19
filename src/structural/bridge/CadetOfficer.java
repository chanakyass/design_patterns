package structural.bridge;

public class CadetOfficer extends Player{

    public CadetOfficer(String name, Gun gun) {
        super(name, gun);
    }

    @Override
    public void shoot() {
        System.out.println("At high risk. Involved in the frontline. Real soldier");
        gun.fire();
    }
}
