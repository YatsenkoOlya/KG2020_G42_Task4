/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.third.IModel;
import kg2019examples_task4threedimensions.third.Plane;
import kg2019examples_task4threedimensions.third.PolyLine3D;
import static java.lang.Math.abs;

/**
 * Описывает трёхмерный отрезок
 * @author Alexey
 */
public class Line3D implements IModel {
    private final Vector3 p1;
    private final Vector3 p2;
    private static final float EPSILON = 1e-10f;

    public Line3D(Vector3 p1, Vector3 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public List<PolyLine3D> getLines() {
        return Collections.singletonList(new PolyLine3D(
                Arrays.asList(p1, p2)
                , false));
    }

    public Vector3 getIntersectionWithPlane(Plane plane) throws LinePlaneParallelException { // пересечение с плоскостью
        float x1 = p1.getX();
        float y1 = p1.getY();
        float z1 = p1.getZ();
        float m = p2.getX() - p1.getX();
        float n = p2.getY() - p1.getY();
        float p = p2.getZ() - p1.getZ();
        float A = plane.getA();
        float B = plane.getB();
        float C = plane.getC();
        float D = plane.getD();

        if (StrictMath.abs(A * m + B * n + p * C) < EPSILON) {
            throw new LinePlaneParallelException("Line and plane are parallel");
        }

        float t = -(A * x1 + B * y1 + C * z1 + D) / (A * m + B * n + C * p);

        return new Vector3(x1 + m * t, y1 + n * t, z1 + p * t);
    }
}
