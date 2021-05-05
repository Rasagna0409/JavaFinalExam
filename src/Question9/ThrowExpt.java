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
public class ThrowExpt {

    public static void xbox() {
        System.out.println("Program for Question9 Example for Throw Exception");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        try {
            throw new NullPointerException("Example for Xbox");
        } catch (NullPointerException e) {
            System.out.println("Example for throw exception");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            ThrowExpt.xbox();
        } catch (NullPointerException e) {
            System.out.println("Example for throw exception in main class");
        }
    }

}
