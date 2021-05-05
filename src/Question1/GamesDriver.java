/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author S542264
 */
public class GamesDriver {

    public static void main(String[] args) {

        System.out.println("Program for Question1 Interfaces Example2");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------"); 
        Games f = new Xbox();
        Games d = new PlayStation();
        f.price();
        d.price();

    }

}
