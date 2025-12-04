package task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Menushka extends JFrame{
    private final JTextArea textArea = new JTextArea("This is the area you can write text.");

    public Menushka() {
        super("Hello Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        saveItem.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Pretend saving...", "Save", JOptionPane.INFORMATION_MESSAGE)
        );
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // меню Edit
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");

        copyItem.addActionListener(e -> textArea.copy());
        cutItem.addActionListener(e -> textArea.cut());
        pasteItem.addActionListener(e -> textArea.paste());

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // меню Help
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Simple menu example", "Help", JOptionPane.INFORMATION_MESSAGE)
        );
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        btn1.addActionListener((ActionEvent e) ->
                JOptionPane.showMessageDialog(this, "Button 1 pressed")
        );
        btn2.addActionListener((ActionEvent e) ->
                JOptionPane.showMessageDialog(this, "Button 2 pressed")
        );

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        setLayout(new BorderLayout(5, 5));
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menushka::new);
    }
}
