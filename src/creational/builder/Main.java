package creational.builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilderImpl();
        Director director = new Director(houseBuilder);
        House builtHouse = director.buildRichAndAffluentHouse();
        System.out.println(builtHouse);
    }
}
