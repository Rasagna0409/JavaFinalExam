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
public class SquareDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Program For Question 2");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-----------------------------------------------");
        GeometricObject[] geoObject = new GeometricObject[5];
        geoObject[0] = new Square(5);
        geoObject[1] = new Square(3);
        geoObject[2] = new Square(20);
        geoObject[3] = new Square(7);
        geoObject[4] = new Square(9);
        for (GeometricObject geo : geoObject) {
            System.out.println("Area of Square is " + geo.area());
            geo.howToColor();
        }

    }

}
