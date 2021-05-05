/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author S542264
 */
public class Recursive {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int n) {
        
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for Question10 Recursive Example");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
