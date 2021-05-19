package structural.bridge;

public class Major extends Player{
    public Major(String name, Gun gun) {
        super(name, gun);
    }

    @Override
    public void shoot() {
        System.out.println("Above cadets. Leader. At medium risk.");
        gun.fire();
    }
}
