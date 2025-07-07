public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5,3);
        System.out.println(r.getPerimeter());
        System.out.println(r.getLength());
        System.out.println(r.getArea());

        Square s = new Square();
        s.setColor("blue");
        System.out.println(s.getColor());

        Circle c = new Circle("blue",false, 3);
        System.out.println(c.getPerimeter());


    }
}