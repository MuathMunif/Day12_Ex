public class Square extends Rectangle{

    public Square(){
        super(1,1);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color, boolean filled , double side){
        super(color,filled,side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

}
