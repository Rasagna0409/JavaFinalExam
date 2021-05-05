/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542264
 */
public class ArException {

    public int divide(int x, int y) throws ArithmeticException {

        System.out.println("Program for Question9 Example for ThrowsException");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        int c = x / y;
        return c;
    }

    public static void main(String args[]) {

        ArException ae = new ArException();
        try {
            ae.divide(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
