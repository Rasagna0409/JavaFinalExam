/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.IOException;

/**
 *
 * @author S542264
 */
public class Que8Exmpl1 {

    /**
     * @param args the command line arguments
     */
    public void Th(int num) throws IOException, ClassNotFoundException {
        if (num == 1) {
            throw new IOException("IOException Occurred");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }

    public static void main(String args[]) {

        System.out.println("Program for Question8 exmp1");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        try {
            Que8Exmpl1 t = new Que8Exmpl1();
            t.Th(0);
        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }
    }

}
