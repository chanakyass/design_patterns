package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza("Plain pizza");
        pizza = new PanneerTopping(pizza);
        pizza = new SalamiTopping(pizza);
        System.out.println(pizza.getName()+pizza.getDescription()+" costs: "+ pizza.cost());
    }
}
