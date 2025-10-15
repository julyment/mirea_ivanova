public class TestMovableShape {
    public static void main(String[] args) {
        System.out.println("MovablePoint");
        MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
        System.out.println("Начальное положение: " + p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("После движения: " + p1);


        System.out.println("\nMovableCircle");
        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 5);
        System.out.println("Начальное положение: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("После движения: " + circle);


        System.out.println("\nMovableRectangle");
        MovableRectangle rect = new MovableRectangle(0, 0, 4, 4, 1, 1);
        System.out.println("Начальное положение: " + rect);
        rect.moveUp();
        rect.moveRight();
        System.out.println("После движения: " + rect);
    }
}
