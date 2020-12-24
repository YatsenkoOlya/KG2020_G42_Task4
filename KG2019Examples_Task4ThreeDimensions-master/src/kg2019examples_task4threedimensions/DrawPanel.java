/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg2019examples_task4threedimensions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import kg2019examples_task4threedimensions.draw.IDrawer;
import kg2019examples_task4threedimensions.draw.ShadowDrawer;
import kg2019examples_task4threedimensions.draw.SimpleEdgeDrawer;
import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.screen.ScreenConverter;
import kg2019examples_task4threedimensions.third.Camera;
import kg2019examples_task4threedimensions.third.Plane;
import kg2019examples_task4threedimensions.third.Scene;
import models.*;

/**
 *
 * @author Alexey
 */
public class DrawPanel extends JPanel implements CameraController.RepaintListener {
    private final Scene scene;
    private final ScreenConverter sc;
    private final Camera cam;
    private Plane plane;
    private Vector3 pointLight;
    
    public DrawPanel() {
        super();
        sc = new ScreenConverter(-1, 1, 2, 2, 1, 1);
        cam = new Camera();
        CameraController camController = new CameraController(cam, sc);
        scene = new Scene(Color.WHITE.getRGB());
        scene.showAxes();

        this.plane = new Plane(0, 0, -0.2f, 1);
        this.pointLight = new Vector3(0, 0, -3);

        /*scene.getModelsList().add(new Parallelepiped(
                new Vector3(-0.4f, -0.4f, -0.4f), 
                new Vector3(0.4f, 0.4f, 0.4f)
        ));*/

        /*scene.getModelsList().add(new Cube(
                0.8f,
                new Vector3(-0.4f, 0.4f, 0.4f)
        ));*/

        /*scene.getModelsList().add(new Octahedron(
                new Vector3(0, 0.5f, 0),
                0.5f
                ));*/

        /*scene.getModelsList().add(new Tetrahedron(
                new Vector3(0, 0, 0),
                0.5f
        ));*/

      /* scene.getModelsList().add(new Icosahedron(
                0.5f,
                new Vector3(0,0, 0)
                ));*/

       /* scene.getModelsList().add(new Dodecahedron(
                new Vector3(0,0, 0),
                0.5f
        ));*/

        camController.addRepaintListener(this);
        addMouseListener(camController);
        addMouseMotionListener(camController);
        addMouseWheelListener(camController);
    }

    public void setFigure(Figures figure) {
        switch (figure) {
            case TETRAHEDRON : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Tetrahedron(
                        new Vector3(0, 0, 0),
                        0.5f
                ));
                break;
            }
            case CUBE : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Cube(
                        0.8f,
                        new Vector3(-0.4f, 0.4f, 0.4f)
                ));
                break;
            }
            case OCTAHEDRON : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Octahedron(
                        new Vector3(0, 0.5f, 0),
                        0.5f
                ));
                break;
            }
            case DODECAHEDRON : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Dodecahedron(
                        new Vector3(0,0, 0),
                        0.5f
                ));
                break;
            }
            case ICOSAHEDRON : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Icosahedron(
                        0.5f,
                        new Vector3(0,0, 0)
                ));
                break;
            }
           /* case ICOSAHEDRON : {
                scene.getModelsList().clear();
                scene.getModelsList().add(new Icosahedron(
                        new Vector3(0,0, 0),
                        0.8f,
                        0.4f
                ));
                break;
            }*/
        }
    }

    public void setPointLight(Vector3 pointLight) {
        System.out.println(pointLight);
        this.pointLight = pointLight;
    }

    public void setPlane(Plane plane) {
        System.out.println(plane);
        this.plane = plane;
    }
    
    @Override
    public void paint(Graphics g) {
        sc.setScreenSize(getWidth(), getHeight());
        BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) bi.getGraphics();

        IDrawer edgeDrawer = new SimpleEdgeDrawer(sc, graphics);
        ShadowDrawer shadowDrawer = new ShadowDrawer(sc, graphics);

        scene.drawShapes(edgeDrawer, cam);
        scene.drawShadows(shadowDrawer, cam, pointLight, plane);

        g.drawImage(bi, 0, 0, null);
        graphics.dispose();
    }

    @Override
    public void shouldRepaint() {
        repaint();
    }
}
