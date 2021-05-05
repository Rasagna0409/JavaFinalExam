/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542264
 */
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double circleRadius) {
        super(circleRadius);
    }

    @Override
    public int compareTo(Circle arg0) {
        Double area1 = super.getArea();
        Double area2 = arg0.getArea();
        return Double.compare(area1, area2);
    }

    public double getArea() {
        double area = super.getArea();
        return area;
    }
}
