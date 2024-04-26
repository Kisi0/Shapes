
    class Circle extends Shape {
        private double radius;

        Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
