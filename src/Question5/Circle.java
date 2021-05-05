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
public class Circle {

    private double circleRadius;
    

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getArea() {
        double area = Math.PI * circleRadius * circleRadius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "circleRadius=" + circleRadius + '}';
    }

}
