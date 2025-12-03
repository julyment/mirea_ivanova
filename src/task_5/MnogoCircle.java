package task_5;

import task_3.Circle;

public class MnogoCircle {
    public static void main(String[] args) {
        Circle[] mass = new Circle [10];
        double max = 0;
        for (int i = 0; i < mass.length; i++){
            mass[i] = new Circle(i+1);
            System.out.println("Площадь круга " + (i+1) + ": " + mass[i].getArea());
            if (max < mass[i].getArea()){
                max = mass[i].getArea();
            }
        }
        System.out.println("Максимальная площадь: " + max);
    }
}
