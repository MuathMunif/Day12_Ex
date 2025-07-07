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
        this.radius= radius*3.1416;
        return radius;
    }

    public double getPerimeter(){
        this.radius = radius *2 *3.1416;
        return radius;
    }

}
