public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "blue", false);
        Shape s2 = new Rectangle("green", true, 3.0, 4.0);
        Shape s3 = new Square(4.0, "yellow", true);

        System.out.println(s1); // Circle[Shape[color=blue, filled=false], radius=5.5]
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());

        System.out.println(s3);
        System.out.println("Perimeter: " + s3.getPerimeter());
    }
}

