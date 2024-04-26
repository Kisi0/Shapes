public class Rectangle extends Shape {
    private double gjeresi;
    private double gjatesi;

    Rectangle(String name, double gjeresi,double gjatesi) {
        super(name);
        this.gjeresi=gjeresi;
        this.gjatesi=gjatesi;
    }

    @Override
    public double calculateArea() {
        return gjeresi * gjatesi;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (gjeresi+ gjatesi);
    }
}
