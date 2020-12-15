package models;

import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.third.IModel;
import kg2019examples_task4threedimensions.third.PolyLine3D;
import kg2019examples_task4threedimensions.third.Scene;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Octahedron implements IModel {
    private Vector3 LTF, RBN;
    private final float length;

    public Octahedron(Vector3 LTF, float length) {
        this.LTF = LTF; // верхняя точка
        this.length = length;
        this.RBN = new Vector3(LTF.getX(), LTF.getY() - 2 * length, LTF.getZ()); // нижняя точка
    }

    @Override
    public List<PolyLine3D> getLines() {
        LinkedList<PolyLine3D> lines = new LinkedList<>();

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(LTF.getX(), LTF.getY(), LTF.getZ()),
                new Vector3(LTF.getX() + length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() - length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(LTF.getX(), LTF.getY(), LTF.getZ()),
                new Vector3(LTF.getX() - length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() - length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(LTF.getX(), LTF.getY(), LTF.getZ()),
                new Vector3(LTF.getX() - length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() + length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(LTF.getX(), LTF.getY(), LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() + length),
                new Vector3(LTF.getX() + length, LTF.getY() - length, LTF.getZ())
        }), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(LTF.getX() + length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() - length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(LTF.getX() - length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() - length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(LTF.getX() - length, LTF.getY() - length, LTF.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() + length)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(LTF.getX(), LTF.getY() - length, LTF.getZ() + length),
                new Vector3(LTF.getX() + length, LTF.getY() - length, LTF.getZ())
        }), true));
        return lines;
    }
}
