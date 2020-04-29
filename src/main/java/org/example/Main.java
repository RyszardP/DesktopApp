package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(500, 500);
        main.setVisible(true);
        main.setTitle("Import and export");
        main.setLayout(new FlowLayout());
        main.setResizable(true);
        Button button1 = new Button("OK");
        main.add(button1);
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });

        Panel panel = new Panel();
        panel.setBackground(Color.green);
        GridLayout layout = new GridLayout(0, 3);
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);

        Checkbox checkbox;
        for (int i = 0; i < 15; i++) {
            checkbox = new Checkbox("checkbox" + i);
            if (i % 2 == 0) {
                checkbox.setState(true);
            }
            panel.add(checkbox);
        }
        main.add(panel);
        main.pack();
    }
}
