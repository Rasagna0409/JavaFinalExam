/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorable;

/**
 *
 * @author S542264
 */
public class Square extends GeometricObject implements Colorable {
    private double s;
    public Square(double s) {
        this.s = s;
    }
    public double area() {
        return s * s;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
