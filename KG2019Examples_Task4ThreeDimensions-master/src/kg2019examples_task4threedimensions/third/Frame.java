package kg2019examples_task4threedimensions.third;

import kg2019examples_task4threedimensions.DrawPanel;
import kg2019examples_task4threedimensions.math.Vector3;
import models.Figures;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Frame extends JFrame {
    public Frame() {
        DrawPanel panel = new DrawPanel();
        setPreferredSize(new Dimension(950, 950));
        Container container = getContentPane();
        add(panel);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu menuDraw = new JMenu("Рисовать фигуры");
        JMenuItem body1 = new JMenuItem("1. Тетраэдр");
        JMenuItem body2 = new JMenuItem("2. Куб");
        JMenuItem body3 = new JMenuItem("3. Октаэдр");
        JMenuItem body4 = new JMenuItem("4. Додекаэдр");
        JMenuItem body5 = new JMenuItem("5. Икосаэдр");
        JMenu menuLight = new JMenu("Параметры освещения");
        JMenuItem planeItem = new JMenuItem("Ввести плоскость тени");
        JMenuItem pointLightItem = new JMenuItem("Ввести координаты точки источника");

        menuDraw.add(body1);
        menuDraw.add(body2);
        menuDraw.add(body3);
        menuDraw.add(body4);
        menuDraw.add(body5);
        menuLight.add(planeItem);
        menuLight.add(pointLightItem);
        jMenuBar.add(menuDraw);
        jMenuBar.add(menuLight);
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

        planeItem.addActionListener(actionEvent -> {
            List<Float> planeArgs = new ArrayList<>();
            String inputDialog = JOptionPane.showInputDialog("Введите A, B, C и D для плоскости тени A*x + B*y + C*z + D = 0");
            try {
                String[] functionArgsString = inputDialog.split("[ ]");
                for (String arg : functionArgsString) {
                    planeArgs.add(Float.parseFloat(arg.replace(',', '.')));
                }
                if (planeArgs.size() == 4) {
                    Plane plane = new Plane(planeArgs.get(0), planeArgs.get(1), planeArgs.get(2), planeArgs.get(3));
                    panel.setPlane(plane);
                    container.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Неверное количество атрибутов");
                }
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Атрибуты должны быть вещественными числами");
            }
        });

        pointLightItem.addActionListener(actionEvent -> {
            List<Float> pointLightArgs = new ArrayList<>();
            String inputDialog = JOptionPane.showInputDialog("Введите координаты точечного источника света");
            try {
                String[] functionArgsString = inputDialog.split("[ ]");
                for (String arg : functionArgsString) {
                    pointLightArgs.add(Float.parseFloat(arg.replace(',', '.')));
                }
                if (pointLightArgs.size() == 3) {
                    Vector3 pointLight = new Vector3(pointLightArgs.get(0), pointLightArgs.get(1), pointLightArgs.get(2));
                    panel.setPointLight(pointLight);
                    container.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Неверное количество атрибутов");
                }
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Атрибуты должны быть вещественными числами");
            }
        });
    }
}
