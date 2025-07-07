public class Circle extends Shape{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }


    public double getArea(){
        double pi = 3.1416;
        return pi * radius * radius;
    }

    public double getPerimeter(){
        this.radius = radius *2 *3.1416;
        return radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}
