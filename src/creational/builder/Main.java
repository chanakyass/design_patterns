package creational.builder;
/*
Builder pattern is used when new features are being added to the classes and instantiating objects using constructor with
so many args becomes tedious. So we build the object using a builder that follows the same construction process although different representations
can be produced.
A director can take up the job of building the object by changing various parameters at the time of its creation and produce different representations
of objects of same type.
 */
public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilderImpl();
        Director director = new Director(houseBuilder);
        House builtHouse = director.buildRichAndAffluentHouse();
        System.out.println(builtHouse);
    }
}
