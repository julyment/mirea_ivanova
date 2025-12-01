package task_3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ShowImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите полный путь к изображению: ");
        String path = sc.nextLine().trim();

        // Загружаем картинку
        ImageIcon icon = new ImageIcon(path);
        if (icon.getIconWidth() <= 0 || icon.getIconHeight() <= 0) {
            System.out.println("❌ Не удалось загрузить изображение. Проверьте путь.");
            return;
        }


        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Просмотр изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel(icon);
            label.setHorizontalAlignment(SwingConstants.CENTER);

            frame.add(label, BorderLayout.CENTER);
            frame.pack();              // подгоняет окно под размеры картинки
            frame.setLocationRelativeTo(null); // центр экрана
            frame.setVisible(true);
        });
    }
}
