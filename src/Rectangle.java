public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 2.0;
        this.length = 3.0;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return (this.length * this.width);
    }

    @Override
    public double getPerimeter() {
        return (2*(this.length+this.width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
