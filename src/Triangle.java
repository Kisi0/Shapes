public class Triangle extends Shape{
        private double baza;
        private double lartesia;

        private double hipotenuza;

       Triangle(String name, double baza,double lartesia, double hipotenuza) {  //konstruktori
            super(name);
            this.baza=baza;
            this.lartesia=lartesia;
            this.hipotenuza=hipotenuza;

        }
        @Override
        public double calculateArea() {
            return (baza * lartesia)/2 ;
        }

        @Override
        double calculatePerimeter() {
            return baza+lartesia+hipotenuza;
        }
    }

