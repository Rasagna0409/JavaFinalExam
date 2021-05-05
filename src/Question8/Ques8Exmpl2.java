/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author S542264
 */
public class Ques8Exmpl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, InputMismatchException, ArithmeticException {
        
        System.out.println("Program for Question8 exmp2");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        try {
            Scanner sc = new Scanner(new File("inputFile.txt"));
            int num = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
