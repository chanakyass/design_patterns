package structural.decorator;

public class PanneerTopping extends PizzaDecorator {

    public PanneerTopping(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " slimy Panneer,";
    }

    @Override
    public double cost() {
        return super.cost() + 50.0;
    }
}
