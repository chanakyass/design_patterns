package creational.builder;

public class Director {
    private final HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildRichAndAffluentHouse() {
        return houseBuilder.installFirePlace("Big fireplace which provides warmth to a big hall").installFurnishings("Large and premium sofas")
                .installGarden("It's bigger than your mama's").installGPS("Yeah GPS baby")
        .installSepticTank("Septic tank that drains into neighbours. Because rich don't deal with that").getHouse();

    }
}
