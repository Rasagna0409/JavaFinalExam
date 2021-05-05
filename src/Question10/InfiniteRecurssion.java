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
public class InfiniteRecurssion {

    int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n);
        }
    }

    public static void main(String args[]) {
        System.out.println("Program for Question10 Infinite Recursive Example");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        InfiniteRecurssion r = new InfiniteRecurssion();
        r.sum(2);

    }

}
