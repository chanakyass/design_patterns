package structural.builder;

public class HouseBuilderImpl implements HouseBuilder{

    private final House house;

    public HouseBuilderImpl() {
        this.house = new House();
    }

    @Override
    public HouseBuilder installGPS(String gps) {
        house.setGps(gps);
        return this;
    }

    @Override
    public HouseBuilder installFirePlace(String firePlace) {
        house.setFirePlace(firePlace);
        return this;
    }

    @Override
    public HouseBuilder installSepticTank(String septicTank) {
        house.setSepticTank(septicTank);
        return this;
    }

    @Override
    public HouseBuilder installGarden(String garden) {
        house.setGarden(garden);
        return this;
    }

    @Override
    public HouseBuilder installFurnishings(String furnishings) {
        house.setFurnishings(furnishings);
        return this;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
