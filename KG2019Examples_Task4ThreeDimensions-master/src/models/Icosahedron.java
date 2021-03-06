package models;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.third.IModel;
import kg2019examples_task4threedimensions.third.PolyLine3D;

/*public class Icosahedron implements IModel {
    private final Vector3 RBN;
    private final float length;
    private final float n;

    public Icosahedron(Vector3 RBN, float length, float n) {
        this.length = length;
        this.RBN = RBN;
        this.n = n;
    }

    @Override
    public List<PolyLine3D> getLines() {
        LinkedList<PolyLine3D> lines = new LinkedList<>();
        // DCC1
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length/2),RBN.getY() + ((length-n) / 2 + n), RBN.getZ() + length),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY() + length,RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + ((length-n) / 2 + n),RBN.getY() + length, RBN.getZ() + length / 2)
        }), true));
        //DD1E
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length/2),RBN.getY() + ((length-n) / 2 + n), RBN.getZ() + length),
                new Vector3(RBN.getX() + length / 2, RBN.getY() + (length - n) / 2,RBN.getZ() + length),
                new Vector3(RBN.getX() + length,RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n)
        }), true));
        //D1EG
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY() + (length - n) / 2,RBN.getZ() + length),
                new Vector3(RBN.getX() + length,RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n),
                new Vector3(RBN.getX() + (length - n) / 2 + n, RBN.getY(),RBN.getZ() + length / 2)
        }), true));
        //D1GK
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getY() + (length - n) / 2,RBN.getZ() + length),
                new Vector3(RBN.getX() + (length - n) / 2 + n, RBN.getY(),RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY(), RBN.getZ() + length / 2)
        }), true));
        //KOG
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY(), RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length / 2,RBN.getY() + (length - n) / 2, RBN.getZ()),
                new Vector3(RBN.getX() + (length - n) / 2 + n, RBN.getY(),RBN.getZ() + length / 2)
        }), true));
        //EFC1
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length,RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n),
                new Vector3(RBN.getX() + length, RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + ((length-n) / 2 + n),RBN.getY() + length, RBN.getZ() + length / 2)
        }), true));
        //EFG
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length,RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n),
                new Vector3(RBN.getX() + length, RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + (length - n) / 2 + n, RBN.getY(),RBN.getZ() + length / 2)
        }), true));
        //OGF
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2,RBN.getY() + (length - n) / 2, RBN.getZ()),
                new Vector3(RBN.getX() + (length - n) / 2 + n, RBN.getY(),RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length, RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2)
        }), true));
        //KD1L
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY(), RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length / 2, RBN.getY() + (length - n) / 2,RBN.getZ() + length),
                new Vector3(RBN.getX(),RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n)
        }), true));
        //KML
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY(), RBN.getZ() + length / 2),
                new Vector3(RBN.getX(), RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2), RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX(),RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n)
        }), true));
        //KMO
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY(), RBN.getZ() + length / 2),
                new Vector3(RBN.getX(), RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2), RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + length / 2,RBN.getY() + (length - n) / 2, RBN.getZ())
        }), true));
        //MQO
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2), RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + length / 2, RBN.getZ() + (length - n) / 2 + n, RBN.getZ()),
                new Vector3(RBN.getX() + length / 2,RBN.getY() + (length - n) / 2, RBN.getZ())
        }), true));
        //OQF
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2,RBN.getY() + (length - n) / 2, RBN.getZ()),
                new Vector3(RBN.getX() + length / 2, RBN.getZ() + (length - n) / 2 + n, RBN.getZ()),
                new Vector3(RBN.getX() + length, RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2)
        }), true));
        //C1QF
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + ((length-n) / 2 + n),RBN.getY() + length, RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length / 2, RBN.getZ() + (length - n) / 2 + n, RBN.getZ()),
                new Vector3(RBN.getX() + length, RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2)
        }), true));
        //DC1E
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length/2),RBN.getY() + ((length-n) / 2 + n), RBN.getZ() + length),
                new Vector3(RBN.getX() + ((length-n) / 2 + n),RBN.getY() + length, RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length,RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n)
        }), true));
        //DD1L
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length/2),RBN.getY() + ((length-n) / 2 + n), RBN.getZ() + length),
                new Vector3(RBN.getX() + length / 2, RBN.getY() + (length - n) / 2,RBN.getZ() + length),
                new Vector3(RBN.getX(),RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n)
        }), true));
        //DLC
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + (length/2),RBN.getY() + ((length-n) / 2 + n), RBN.getZ() + length),
                new Vector3(RBN.getX(),RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY() + length,RBN.getZ() + length / 2)
        }), true));
        //LMC
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(),RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2),RBN.getZ() + (length - n) / 2 + n),
                new Vector3(RBN.getX(), RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2), RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY() + length,RBN.getZ() + length / 2)
        }), true));
        //MCQ
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX(), RBN.getY() + (float) (Math.sqrt(2*n*n - length*length + 2*n*length) / 2), RBN.getZ() + (length - n) / 2),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY() + length,RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + length / 2, RBN.getZ() + (length - n) / 2 + n, RBN.getZ())
        }), true));
        //QCC1
        lines.add(new PolyLine3D(Arrays.asList(new Vector3[]{
                new Vector3(RBN.getX() + length / 2, RBN.getZ() + (length - n) / 2 + n, RBN.getZ()),
                new Vector3(RBN.getX() + (length - n) / 2, RBN.getY() + length,RBN.getZ() + length / 2),
                new Vector3(RBN.getX() + ((length-n) / 2 + n),RBN.getY() + length, RBN.getZ() + length / 2)
        }), true));

        return lines;
    }
}*/


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
