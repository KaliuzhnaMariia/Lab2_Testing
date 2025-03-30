public class Parallelogram {
    private double base;
    private double height;
    private double side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + side);
    }

    public boolean isSquare() {
        return base == side && base == height;
    }

    public double getDiagonal() {
        return Math.sqrt(base * base + side * side);
    }

    public void increaseSides(double value) {
        base += value;
        height += value;
        side += value;
    }

    public static void main(String[] args) {
        Parallelogram p = new Parallelogram(10, 5, 7);
        System.out.println("Area: " + p.getArea());
        System.out.println("Perimeter: " + p.getPerimeter());
        System.out.println("Is square: " + p.isSquare());
        System.out.println("Diagonal: " + p.getDiagonal());

        p.increaseSides(2);
        System.out.println("After increasing sides by 2:");
        System.out.println("New area: " + p.getArea());
        System.out.println("New perimeter: " + p.getPerimeter());
    }
}
