/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542264
 */
public class UnCheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Program for Question3 Widening Casting Example2");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        try {
            int arr[] = {2, 5, 6, 7, 8};
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
