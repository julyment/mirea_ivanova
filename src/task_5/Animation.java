package task_5;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel{
    private static final int FRAME_COUNT = 6;
    private static final int FPS = 8;

    private Image[] frames = new Image[FRAME_COUNT];
    private int currentFrame = 0;

    public Animation() {

        // === Загружаем 6 отдельных файлов ===
        for (int i = 0; i < FRAME_COUNT; i++) {
            String path = "src/task_5/frame" + (i + 1) + ".jpg";
            frames[i] = new ImageIcon(path).getImage();

            if (frames[i].getWidth(null) <= 0) {
                throw new RuntimeException("Не удалось загрузить: " + path);
            }
        }

        int w = frames[0].getWidth(null);
        int h = frames[0].getHeight(null);

        setPreferredSize(new Dimension(w, h));

        int delay = 1000 / FPS;
        new Timer(delay, e -> {
            currentFrame = (currentFrame + 1) % FRAME_COUNT;
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Птичка летит");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Animation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

