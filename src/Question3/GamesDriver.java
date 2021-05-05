/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542264
 */
public class GamesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for Question3 Upcasting & Downcasting Example");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        //upcasting example
        Xbox x = new Xbox();
        Games game = (Games) x;
        game.price();
        //downcasting example
        Games gameDown = new Xbox();
        ((Xbox) gameDown).version();
    }

}
