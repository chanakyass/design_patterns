package structural.decorator;

public class PlainPizza implements Pizza {
    String name;
    String description;

    public PlainPizza(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return 100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return " Any additional toppings: ";
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
