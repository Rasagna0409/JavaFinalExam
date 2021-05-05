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
public class CuisineDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Program for Question1 Interfaces Example2");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");        
        Cuisine Id = new Indian();
        Cuisine It = new Italian();
        Id.bestfood();
        It.bestfood();

    }
    
}
