import java.security.PublicKey;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length){
        this.width= width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled , double width, double length){
        super(color,filled);
        this.width = width;
        this.length= length;
    }

    public void setWidth(double width){
        if (width > 0) {
            this.width = width;
        }
        else {
            System.out.println("you can't insert negative width");
        }
    }
    public void setLength(double length){
        if (length > 0) {
            this.length = length;
        }
        else {
            System.out.println("you can't insert negative length");
        }
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length;
    }
}
