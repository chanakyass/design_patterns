package structural.composite;

class Dot implements Graphic{

    private final double x, y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.printf("point at %.2f, %.2f \n", x, y);
    }
}

class Line implements Graphic {
    private final Dot d1 , d2;

    public Line(int x1, int y1, int x2, int y2) {
        this.d1 = new Dot(x1, y1);
        this.d2 = new Dot(x2, y2);

    }

    @Override
    public void draw() {
        System.out.printf("Line segment from %.2f, %.2f to %.2f, %.2f", d1.getX(), d1.getY(), d2.getX(), d2.getY());
        double slope = (d2.getY() - d1.getY())/(d2.getX() - d1.getX());
        for(double i = d1.getX(); i<=d2.getX(); i++){
            new Dot(i, (i-d1.getX())*slope + d1.getY()).draw();
        }
    }
}

class Circle implements Graphic {

    private final Dot dot;
    int radius;

    public Circle(int x, int y, int radius) {
        this.dot = new Dot(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Draw circle with center %.2f, %.2f and radius %d", dot.getX(), dot.getY(), radius);
        for(double i = dot.getX() - radius; i<= dot.getX()+radius; i++){
            double sqrt = Math.sqrt(Math.pow(radius, 2) - Math.pow(i-dot.getX(), 2));
            new Dot(i,  dot.getY() + sqrt).draw();
            new Dot(i, dot.getY() - sqrt).draw();
        }
    }
}
