package ProgrammingPractice;

public class Circle {



    private double radius;

    public Circle(double radius, double area) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return (double) (2 * 22) /7*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public void setArea(int area) {
        this.radius=area;
    }

    public void setCircumference(int circumference) {
        this.radius=circumference;
    }
}
