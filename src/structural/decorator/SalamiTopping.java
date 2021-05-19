package structural.decorator;

public class SalamiTopping extends PizzaDecorator{

    public SalamiTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " authentic salami,";
    }

    @Override
    public double cost() {
        return super.cost() + 50.0;
    }
}
