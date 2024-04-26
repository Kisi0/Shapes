public class Main {
    public static void main(String[] args) {

        Shape circle=createShape(shapetype.CIRCLE, "Circle", 2.3);
        Shape triangle=createShape(shapetype.TRIANGLE, "Triangle", 2,3,5);
        Shape rectagle=createShape(shapetype.RECTANGLE, "Circle", 2,3);
        printshapeinfo(circle);
        printshapeinfo(rectagle);
        printshapeinfo(triangle);
    }

    public static Shape createShape( shapetype shapeType, String name, double... tedhenat){
        switch (shapeType){
            case CIRCLE:
                return new Circle(name, tedhenat[0]);
            case TRIANGLE:
                return new Triangle(name, tedhenat[0],tedhenat[1],tedhenat[2]);
            case RECTANGLE:
                return  new Rectangle(name, tedhenat[0],tedhenat[1]);
            default:
                System.out.println("invalid shape type");
                return null;
        }
    }
    //marrim nr te pacaktuar parametrash
    //metode ndihmese per te printuar te dhenat e shape
    public static void printshapeinfo(Shape shape){
        System.out.println("shape: " + shape.name);
        System.out.println(("area: " + shape.calculateArea()));
        System.out.println(("perimeter: " + shape.calculatePerimeter()));
        System.out.println();
    }
}