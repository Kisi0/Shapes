abstract class Shape { //prind
    protected String name;

    public Shape(String name) {    //konstruktori me parametra
        this.name = name;
    }


    //metoda
    abstract double calculateArea();
    abstract double calculatePerimeter();


}
