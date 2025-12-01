package task_2;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ShapesPanel extends JPanel {
    private final List<Shape> shapes = new ArrayList<>();

    public ShapesPanel() {
        setPreferredSize(new Dimension(800, 600)); // размер окна
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random rnd = new Random();

        int panelWidth = 800;
        int panelHeight = 600;

        for (int i = 0; i < 20; i++) {
            // случайный цвет
            Color color = new Color(
                    rnd.nextInt(256),
                    rnd.nextInt(256),
                    rnd.nextInt(256)
            );

            // случайно выбираем тип фигуры: 0 – круг, 1 – прямоугольник
            if (rnd.nextBoolean()) {
                int radius = 10 + rnd.nextInt(60); // 10–70
                int x = rnd.nextInt(panelWidth - 2 * radius);
                int y = rnd.nextInt(panelHeight - 2 * radius);
                shapes.add(new Circle(color, x, y, radius));
            } else {
                int width = 20 + rnd.nextInt(100);
                int height = 20 + rnd.nextInt(100);
                int x = rnd.nextInt(panelWidth - width);
                int y = rnd.nextInt(panelHeight - height);
                shapes.add(new Rectangular(color, x, y, width, height));
            }
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
}
}
