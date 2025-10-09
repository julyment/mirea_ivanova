public class Square extends Rectangle{

    public Square(){
        super(3.0,3.0);
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side){
        setSide(side);
    }
}
