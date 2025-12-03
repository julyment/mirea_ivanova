package task_3;

public class NoMistakes {
    public static void main(String[] args) {
        NoMistakes a = new NoMistakes();
        a.method1();
    }
    public void method1() {
        method2();
    }
    public static void method2() {
        Circle c = new Circle();
        System.out.println("What is area " + c.getArea());
    }
}

