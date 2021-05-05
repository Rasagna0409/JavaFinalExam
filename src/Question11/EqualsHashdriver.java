/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author S542264
 */
public class EqualsHashdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for question11");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-----------------------------");
        // Here I am creating objects for EqualsHash by giving some input to the fields, I have created 5 objects
        EqualsHash EH1 = new EqualsHash(12, "Friends", 1234);
        EqualsHash EH2 = new EqualsHash(12, "Bridgeton", 123);
        EqualsHash EH3 = new EqualsHash(17, "Oh my god", 123);
        EqualsHash EH4 = new EqualsHash(17, "Oh my god", 123);
        EqualsHash EH5 = new EqualsHash(12, "Bridgeton", 123);
        System.out.println("*********Equals**********");
        /*Here I am comparing one object's content with the other, as per the generated if condition in the EqualsHashclass
        if all the three variables are equal in both the objects then true witll be return else if atleast one of the variable
        is different then the result will be false*/
        System.out.println(EH1.equals(EH3));
        System.out.println(EH2.equals(EH1));
        System.out.println(EH3.equals(EH4));
        System.out.println(EH4.equals(EH5));
        System.out.println(EH5.equals(EH2));
        System.out.println("*********Hashcode**********");
        /*Here for hashcode as per the code generated in the equals class a unique hashcode will be generated in all cases,
        if the values for any of the two objects is same them same hashcode is generated for them*/
        System.out.println(EH1.hashCode());
        System.out.println(EH2.hashCode());
        System.out.println(EH3.hashCode());
        System.out.println(EH4.hashCode());
        System.out.println(EH5.hashCode());

    }

}
