package task_3;

public class Circle {
    /** Радиус круга */
    double radius;
    /** Количество созданных объектов */
    static int numberOfObjects = 0;
    /** Создает круг с радиусом, равным 1 */
    Circle() {
        radius = 1.0;
        numberOfObjects++;
    }
    /** Создает круг с указанным радиусом */
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    /** Возвращает количество созданных объектов */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    /** Возвращает площадь круга */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
