package creational.builder;

public interface HouseBuilder {
    HouseBuilder installGPS(String gps);
    HouseBuilder installFirePlace(String firePlace);
    HouseBuilder installSepticTank(String septicTank);
    HouseBuilder installGarden(String garden);
    HouseBuilder installFurnishings(String furnishings);
    public House getHouse();
}
