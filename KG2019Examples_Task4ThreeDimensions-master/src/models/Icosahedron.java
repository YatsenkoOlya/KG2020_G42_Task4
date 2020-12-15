package models;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.third.IModel;
import kg2019examples_task4threedimensions.third.PolyLine3D;

public class Icosahedron implements IModel {
    private final Vector3 RBN;
    private final float length;

    public Icosahedron(float length, Vector3 RBN) {
        this.length = length;
        this.RBN = RBN;
    }

    @Override
    public List<PolyLine3D> getLines() {
        LinkedList<PolyLine3D> lines = new LinkedList<>();

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), 0.2f, RBN.getZ()),
                new Vector3(RBN.getX(), -0.2f, RBN.getZ()),
                new Vector3(0.346f, RBN.getY(), RBN.getZ())
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), 0.2f, RBN.getZ()),
                new Vector3(RBN.getX(), -0.2f, RBN.getZ()),
                new Vector3(-0.258f,0,0.231f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(-0.258f,0,0.231f),
                new Vector3(RBN.getX(), -0.2f, RBN.getZ()),
                new Vector3(-0.071f,-0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(-0.258f,0,0.231f),
                new Vector3(RBN.getX(), 0.2f, RBN.getZ()),
                new Vector3(-0.071f,0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(-0.258f,0,0.231f),
                new Vector3(-0.115f,0,0.605f),
                new Vector3(-0.071f,-0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(-0.258f,0,0.231f),
                new Vector3(-0.115f,0,0.605f),
                new Vector3(-0.071f,0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0,-0.2f,0),
                new Vector3(0.302f,-0.324f,0.231f),
                new Vector3(-0.071f,-0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.302f,-0.324f,0.231f),
                new Vector3(0.231f,-0.2f,0.605f),
                new Vector3(-0.071f,-0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.231f,-0.2f,0.605f),
                new Vector3(-0.115f,0,0.605f),
                new Vector3(-0.071f,-0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0,0.2f,0),
                new Vector3(0.302f,0.324f,0.231f),
                new Vector3(-0.071f,0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.302f,0.324f,0.231f),
                new Vector3(0.231f,0.2f,0.605f),
                new Vector3(-0.071f,0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(-0.115f,0,0.605f),
                new Vector3(0.231f,0.2f,0.605f),
                new Vector3(-0.071f,0.324f,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.231f,-0.2f,0.605f),
                new Vector3(0.231f,0.2f,0.605f),
                new Vector3(-0.115f,0,0.605f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.346f,0,0),
                new Vector3(0.302f,0.324f,0.231f),
                new Vector3(0.489f,0,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.346f,0,0),
                new Vector3(0.489f,0,0.374f),
                new Vector3(0.302f,-0.324f,0.231f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.231f,-0.2f,0.605f),
                new Vector3(0.489f,0,0.374f),
                new Vector3(0.302f,-0.324f,0.231f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.231f,-0.2f,0.605f),
                new Vector3(0.231f,0.2f,0.605f),
                new Vector3(0.489f,0,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.231f,0.2f,0.605f),
                new Vector3(0.302f,0.324f,0.231f),
                new Vector3(0.489f,0,0.374f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.346f,0,0),
                new Vector3(0.302f,-0.324f,0.231f),
                new Vector3(0,-0.2f,0)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(0.346f,0,0),
                new Vector3(0.302f,0.324f,0.231f),
                new Vector3(0,0.2f,0)
        }), true));
        return lines;
    }
}

 /* public List<PolyLine3D> getLines() {
        LinkedList<PolyLine3D> lines = new LinkedList<>();
      /*  float radius = (float) ((length / 4) * Math.sqrt(2 * (5 + Math.sqrt(5))));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY() + (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 4.2f))
        }), true));

       /* lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ())
        }), true));*/

       /* lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY() - (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 2f))
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() - radius + 0.1f, RBN.getY(), RBN.getZ() + length/3-0.1f),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY() + (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 4.2f))
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + radius - 0.1f, RBN.getY(), RBN.getZ() + length/3-0.1f),
                new Vector3(RBN.getX() + length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY() + (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 4.2f))
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY() + (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 4.2f)),
                new Vector3(RBN.getX() + radius - 0.1f, RBN.getY(), RBN.getZ() + length/3-0.1f),
                new Vector3(RBN.getX(),RBN.getY(),RBN.getZ()-0.1f)
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY() + (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 4.2f)),
                new Vector3(RBN.getX() - radius + 0.1f, RBN.getY(), RBN.getZ() + length/3-0.1f),
                new Vector3(RBN.getX(),RBN.getY(),RBN.getZ()-0.1f)
        }), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() - length/1.5f, RBN.getY() - (length * (float) Math.sqrt(3) / 3), RBN.getZ() + length/3),
                new Vector3(RBN.getX(), RBN.getY() - (length * (float) Math.sqrt(3) / 3), RBN.getZ() + (length * (float) Math.sqrt(3) / 2f)),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2))
        }), true));
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() - length/1.5f, RBN.getY() - (length * (float) Math.sqrt(3) / 3), RBN.getZ() + length/3),
                new Vector3(RBN.getX() - radius + 0.1f, RBN.getY(), RBN.getZ() + length/3-0.1f),
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2))
        }), true));


        /*
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(RBN.getX() + length, RBN.getY(), RBN.getZ())
        }), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() - length / 2, RBN.getY(), RBN.getZ() + (length * (float) Math.sqrt(3) / 2)),
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(RBN.getX() - length, RBN.getY(), RBN.getZ())
        }), true));

        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() - length, RBN.getY(), RBN.getZ()),
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ()),
                new Vector3(RBN.getX(), RBN.getY(), RBN.getZ() - (length * (float) Math.sqrt(3) / 2))
        }), true));
        */
//return lines;
