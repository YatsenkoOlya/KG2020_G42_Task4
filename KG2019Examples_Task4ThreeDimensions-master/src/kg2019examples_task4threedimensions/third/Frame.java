package kg2019examples_task4threedimensions.third;

import kg2019examples_task4threedimensions.DrawPanel;
import models.Figures;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        DrawPanel panel = new DrawPanel();
        setPreferredSize(new Dimension(950, 950));
        setResizable(false);
        Container container = getContentPane();
        add(panel);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu menuDraw = new JMenu("Рисовать фигуры");
        JMenuItem body1 = new JMenuItem("1. Тетраэдр");
        JMenuItem body2 = new JMenuItem("2. Куб");
        JMenuItem body3 = new JMenuItem("3. Октаэдр");
        JMenuItem body4 = new JMenuItem("4. Додекаэдр");
        JMenuItem body5 = new JMenuItem("5. Икосаэдр");

        menuDraw.add(body1);
        menuDraw.add(body2);
        menuDraw.add(body3);
        menuDraw.add(body4);
        menuDraw.add(body5);
        jMenuBar.add(menuDraw);
        setJMenuBar(jMenuBar);

        body1.addActionListener(actionEvent -> {
            panel.setFigure(Figures.TETRAHEDRON);
            container.repaint();
        });
        body2.addActionListener(actionEvent -> {
            panel.setFigure(Figures.CUBE);
            container.repaint();
        });
        body3.addActionListener(actionEvent -> {
            panel.setFigure(Figures.OCTAHEDRON);
            container.repaint();
        });
        body4.addActionListener(actionEvent -> {
            panel.setFigure(Figures.DODECAHEDRON);
            container.repaint();
        });
        body5.addActionListener(actionEvent -> {
            panel.setFigure(Figures.ICOSAHEDRON);
            container.repaint();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
