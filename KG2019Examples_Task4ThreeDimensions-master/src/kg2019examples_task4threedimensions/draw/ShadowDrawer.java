package kg2019examples_task4threedimensions.draw;

import kg2019examples_task4threedimensions.math.Vector3;
import kg2019examples_task4threedimensions.screen.ScreenConverter;
import kg2019examples_task4threedimensions.screen.ScreenCoordinates;
import kg2019examples_task4threedimensions.screen.ScreenPoint;
import kg2019examples_task4threedimensions.third.IModel;
import kg2019examples_task4threedimensions.third.Plane;
import kg2019examples_task4threedimensions.third.PolyLine3D;
import models.Line3D;
import models.LinePlaneParallelException;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

public class ShadowDrawer extends ScreenGraphicsDrawer {
    private static final float EPSILON = 1e-10f;

    /**
     * Создаёт экземпляр рисвальщика
     *
     * @param sc преобразователь координат
     * @param gr графикс
     */
    public ShadowDrawer(ScreenConverter sc, Graphics2D gr) {
        super(sc, gr);
    }

    public List<PolyLine3D> getShadows(IModel model, Plane plane, Vector3 light) {

        if (abs(plane.getA() * light.getX() + plane.getB() * light.getY() +
                plane.getC() * light.getZ() + plane.getD()) <= EPSILON) {
            return new LinkedList<>();
        }

        LinkedList<PolyLine3D> lines = (LinkedList<PolyLine3D>) model.getLines();
        LinkedList<PolyLine3D> shadowLines = new LinkedList<>();

        for (PolyLine3D line : lines) {
            LinkedList<Vector3> shadowPoints = new LinkedList<>();
            for (Vector3 point : line.getPoints()) {
                try {
                    Vector3 projection = new Line3D(point, light).getIntersectionWithPlane(plane);
                    if (projection.getDistanceToAnotherPoint(light) < projection.getDistanceToAnotherPoint(point) ||
                            light.getDistanceToAnotherPoint(projection) < light.getDistanceToAnotherPoint(point)) {
                        continue;
                    }
                    shadowPoints.add(projection);
                    shadowLines.addFirst(new PolyLine3D(Arrays.asList(
                            light, projection
                    ), false));
                } catch (LinePlaneParallelException ignored) {
                }
            }
            shadowLines.add(new PolyLine3D(shadowPoints, true));
        }
        return shadowLines;
    }

    @Override
    protected void oneDraw(PolyLine3D polyline) {
        LinkedList<ScreenPoint> points = new LinkedList<>();
        /*переводим все точки в экранные*/
        for (Vector3 v : polyline.getPoints())
            points.add(getScreenConverter().r2s(v));
        getGraphics().setColor(Color.CYAN);
        /*если точек меньше двух, то рисуем отдельными алгоритмами*/
        if (points.size() < 2) {
            if (points.size() > 0)
                getGraphics().fillRect(points.get(0).getI(), points.get(0).getJ(), 1, 1);
            return;
        }
        /*создаём хранилище этих точек в виде двух массивов*/
        ScreenCoordinates coordinates = new ScreenCoordinates(points);
        /*если линия замкнута - рисем полигон, иначе - полилинию*/
        if (polyline.isClosed()) {
            getGraphics().fillPolygon(coordinates.getXx(), coordinates.getYy(), coordinates.size());
        } else {
            getGraphics().setColor(Color.ORANGE);
            getGraphics().drawPolyline(coordinates.getXx(), coordinates.getYy(), coordinates.size());
        }
    }

    @Override
    protected IFilter<PolyLine3D> getFilter() {
        return value -> true;
    }

    @Override
    protected Comparator<PolyLine3D> getComparator() {
        return (polyLine3D, t1) -> 0;
    }
}
