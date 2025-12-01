package task_1;

import javax.swing.*;
import java.awt.*;

public class MatchTable {
    public static void main(String[] args) {
        final int[] milanScore = {0};
        final int[] madridScore = {0};

        JFrame frame = new JFrame("Milan vs Madrid");

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);


        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.add(milanButton);
        buttonsPanel.add(madridButton);

        JPanel infoPanel = new JPanel(new GridLayout(3, 1));
        infoPanel.add(result);
        infoPanel.add(lastScorer);
        infoPanel.add(winner);

        frame.setLayout(new BorderLayout());
        frame.add(buttonsPanel, BorderLayout.NORTH);
        frame.add(infoPanel, BorderLayout.CENTER);

        milanButton.addActionListener(e -> {
            milanScore[0]++;
            result.setText("Result: " + milanScore[0] + " X " + madridScore[0]);
            lastScorer.setText("Last Scorer: AC Milan");

            if (milanScore[0] > madridScore[0]) winner.setText("Winner: AC Milan");
            else if (madridScore[0] > milanScore[0]) winner.setText("Winner: Real Madrid");
            else winner.setText("Winner: DRAW");
        });

        madridButton.addActionListener(e -> {
            madridScore[0]++;
            result.setText("Result: " + milanScore[0] + " X " + madridScore[0]);
            lastScorer.setText("Last Scorer: Real Madrid");

            if (milanScore[0] > madridScore[0]) winner.setText("Winner: AC Milan");
            else if (madridScore[0] > milanScore[0]) winner.setText("Winner: Real Madrid");
            else winner.setText("Winner: DRAW");
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
