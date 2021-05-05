/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.IOException;

/**
 *
 * @author S542264
 */
public class UnCheckedException2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) throws IOException {

        try {
            int x = 0;
            int i = 100 / x;

        } catch (Exception e) {
            e.printStackTrace();
        //System.out.println(e);
        }
    }
}
