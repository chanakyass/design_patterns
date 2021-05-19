package structural.bridge;

public class Main {

    public static void main(String[] args) {

        Gun ak47 = new MachineGun();
        Gun pistol = new HandGun();
        Gun shotgun = new Shotgun();

        Player general = new General("Chandra Bose", pistol);
        Player cadet = new CadetOfficer("Veer", ak47);
        Player major = new Major("Chandrakanth", shotgun);

        general.shoot();
        cadet.shoot();
        major.shoot();
    }



}
