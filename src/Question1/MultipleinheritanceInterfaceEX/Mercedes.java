/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.MultipleinheritanceInterfaceEX;

/**
 *
 * @author S542264
 */
public class Mercedes implements CarInside, Caroutside {

    @Override
    public void gares() {
        // TODO Auto-generated method stub
        System.out.println("It has 5 gares");
    }

    @Override
    public void color() {
        System.out.println("It is red colour");
    }

}
