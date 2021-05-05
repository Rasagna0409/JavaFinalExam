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
public class SearchElement {

    static int listArr[] = {12, 34, 54, 2, 3};

    public static int recSearch(int listArr[], int l, int r, int y) {

        if (r < l) {
            return -1;
        }
        if (listArr[l] == y) {
            return l;
        }
        if (listArr[r] == y) {
            return r;
        }
        return recSearch(listArr, l + 1, r - 1, y);
    }

    public static void main(String[] args) {
        System.out.println("Program for Question10 Search Element Example");
        System.out.println("Rasagna Reddy Banda");
        System.out.println("-------------------------------------------");
        int x = 34;

        int index = recSearch(listArr, 0, listArr.length - 1, x);
        if (index != -1) {
            System.out.println("Element " + x + " is present at index "
                    + index);
        } else {
            System.out.println("Element " + x + " is not present");
        }
    }
}
