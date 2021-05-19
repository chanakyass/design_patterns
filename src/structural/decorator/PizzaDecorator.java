package structural.decorator;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
