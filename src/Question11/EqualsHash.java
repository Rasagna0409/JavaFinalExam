/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author S542264
 */
public class EqualsHash {

    // Initialised variables
    // Here I have declared Seriedid, Seriesname, Seriesduration.
    private int Seriesid;
    private String Seriesname;
    private int Seriesduration;

    //Inserted Constructor
    public EqualsHash(int Seriesid, String Seriesname, int Seriesduration) {
        this.Seriesid = Seriesid;
        this.Seriesname = Seriesname;
        this.Seriesduration = Seriesduration;
    }

    //Inserted Hashcode
    /*hashCode() returns an integer that represents the internal memory address of the object by default.*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.Seriesid;
        hash = 83 * hash + Objects.hashCode(this.Seriesname);
        hash = 83 * hash + this.Seriesduration;
        return hash;
    }

    //Inserted Equals
    //If two objects are equal according to the equals(Object) method then true will be return or else false will be return
    //Here we are comparing the variables using if statements.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EqualsHash other = (EqualsHash) obj;
        if (this.Seriesid != other.Seriesid) {
            return false;
        }
        if (this.Seriesduration != other.Seriesduration) {
            return false;
        }
        if (!Objects.equals(this.Seriesname, other.Seriesname)) {
            return false;
        }
        return true;
    }

}
