package structural.bridge;

/*
Definition: Bridge pattern is used to separate a class or set of classes into separate hierarchies while allowing them to grow separately.
Idea is to create two abstractions where one abstraction contains another and then both of these hierarchies can be subclassed further.

Problems solved:
1) When you want to divide a monolith with many variants of a particular functionality into hierarchies, where each hierarchy can be extended separately.
 */

public class Main {

    public static void main(String[] args) {

        Gun ak47 = new MachineGun("M60");
        Gun pistol = new HandGun("P95");
        Gun shotgun = new Shotgun("S686");

        Player general = new General("Chandra Bose", pistol);
        Player cadet = new CadetOfficer("Veer", ak47);
        Player major = new Major("Chandrakanth", shotgun);

        general.shoot();
        cadet.shoot();
        major.shoot();

    }



}
