package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
    private final List<Graphic> graphics;

    public CompositeGraphic() {
        this.graphics = new ArrayList<>();
    }

    public void add(Graphic graphic){
        graphics.add(graphic);
    }

    public void remove(Graphic graphic){
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }
}
