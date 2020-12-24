package kg2019examples_task4threedimensions.third;

public class Plane {
    private float a, b, c, d;

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }

    public Plane(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("%1$.2fx + %2$.2fy + %3$.2fz + %4$.2f = 0 (%1$.2f %2$.2f %3$.2f %4$.2f)", a, b, c, d);
    }
}
