package structural.composite;

/*
Explanation: Composite design pattern used to represent objects as hierarchy where each member of hierarchy represents an abstraction of the one beneath
and each of these granular objects can be combined to form compositions that provide abstraction to functionality of individual objects
*/

public class Main {
    public static void main(String[] args) {
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(new Circle(0, 0, 2));
        compositeGraphic.add(new Line(0,0,1,1));
        compositeGraphic.add(new Line(0,0,5,2));

        compositeGraphic.draw();
    }
}
