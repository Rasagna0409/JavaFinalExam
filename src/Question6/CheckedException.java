/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author S542264
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String args[]) throws IOException {
        
        System.out.println("Program for Question6 Checked Exception");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-----------------------------------------------------------------------------------------------");
        try {
            FileInputStream f = null;
            f = new FileInputStream("c:filename.txt");
            int k;

            while ((k = f.read()) != -1) {
                System.out.print((char) k);
            }
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
