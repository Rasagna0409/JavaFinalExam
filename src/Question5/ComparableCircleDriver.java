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
public class ComparableCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for Question5");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        ComparableCircle c1 = new ComparableCircle(30.0);
        ComparableCircle c2 = new ComparableCircle(80.0);

        if (c1.compareTo(c2) == -1) {
            System.out.println("Area of larger circle is " + c2.getArea());
        } else if (c1.compareTo(c2) == 0) {
            System.out.println("Same area for two circles " + c2.getArea());
        } else if (c1.compareTo(c2) == 1) {
            System.out.println("Area of larger circle is " + c1.getArea());
        }
    }

}
