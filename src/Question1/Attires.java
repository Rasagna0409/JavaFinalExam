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
public abstract class Attires {

    String type = "Formal";
    String Brand = "Ralf Lauren";

    @Override
    public String toString() {
        return "Attires{" + "types=" + type + ", Brand=" + Brand + '}';
    }

    public void typeofattire() {
        System.out.println("It is Formal");
    }

    public void brandname() {
        System.out.println("It is RalfLauren");
    }

    public abstract String details();

}
