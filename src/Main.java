public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("blue", true);
        System.out.println("The color of shape is : "+shape.getColor());
        System.out.println(shape);// test toString method
        System.out.println("-------------------------");

        // Circle
        Circle circle = new Circle("red",true , 5);
        System.out.println("The Area of the Circle is : "+circle.getArea());
        System.out.println("The Perimeter of the Circle is : "+circle.getPerimeter());
        System.out.println("The color of Circle is : "+circle.getColor());
        circle.setRadius(8);
        System.out.println("After set the r :");
        System.out.println("The Perimeter of the Circle is : "+circle.getPerimeter());
        System.out.println("The color of Circle is : "+circle.getColor());
        System.out.println(circle);
        System.out.println("-------------------------");


        //Rectangle
        Rectangle rectangle = new Rectangle("white",true,5,7);
        System.out.println("The Area of the rectangle is : "+rectangle.getArea());
        System.out.println("The Perimeter of the rectangle is : "+rectangle.getPerimeter());
        System.out.println(rectangle);
        rectangle.setLength(8);
        rectangle.setWidth(9);
        System.out.println("After change the width and length : ");
        System.out.println("The Area of the rectangle is : "+rectangle.getArea());
        System.out.println("The Perimeter of the rectangle is : "+rectangle.getPerimeter());
        System.out.println(rectangle);
        System.out.println("-------------------------");



        //Square
        Square square = new Square("gray", false,3);
        System.out.println("The Area of the Square is : "+square.getArea());
        System.out.println("The Perimeter of the Square is : "+square.getPerimeter());
        System.out.println(square);
        square.setColor("red");
        System.out.println(square);
        System.out.println("-------------------------");

    }
}