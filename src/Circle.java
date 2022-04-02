public class Circle {
//    double radius;
//    String color;
//
//    double getRadius() {
//        double a;
//        a = 3.2;
//    }
//    double getArea() {
//        String name;
//        name = "red";
//    }

//    Circle c1, c2, c3;
//    c1 = new Circle();
//    c2 = new Circle(2.0);
//    c3 = new Circle(3.0, "red");
//    Circle c4 = new Circle();

//    Circle c1 = new Circle();
//    Circle c2 = new Circle();
//
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "res";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) {
        radius =r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
