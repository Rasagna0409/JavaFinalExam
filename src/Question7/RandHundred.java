/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author S542264
 */
public class RandHundred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Rasagna Reddy Banda");
        System.out.println("Program for Question7");
        System.out.println("---------------------------------------------");
        Integer arr[] = new Integer[100];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 100) {
            System.out.println("Element at index " + index + " position is: " + arr[index]);
        } else {
            System.out.println("index is out of bounds");
        }

    }

}
