package task_2;
import javax.swing.*;
import java.awt.*;

public class CountryInfo extends JFrame{
    public CountryInfo() {
        super("Country Info");

        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Australia", "China", "England", "Russia"};

        String[] info = {
                "Capital: Canberra",
                "Capital: Beijing",
                "Capital: London",
                "Capital: Moscow"
        };

        JComboBox<String> combo = new JComboBox<>(countries);

        JLabel label = new JLabel("Select a country");

        add(combo);
        add(label);

        combo.addActionListener(e -> {
            int index = combo.getSelectedIndex();
            label.setText(info[index]);
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CountryInfo::new);
    }
}
