package structural.composite;

/*
Explanation: Composite design pattern is basically an object that is composed of tree structures and
this tree structure can be handled as if it were one single object. Basically if we ever want to execute a functionality over all the
members of the tree, you need to call it only on the highest level and individual members of the tree will execute the function on their own
and possibly provide an output considering of all of them.

Problems solved -
1) Allows a way to represent an object as tree structures.
2) An operation on higher level in the hierarchy would uniformly perform the same operation at all levels below and collect the resultant.
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
