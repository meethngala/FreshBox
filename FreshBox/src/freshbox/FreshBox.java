/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshbox;

import java.util.*;

/**
 * Represents FreshBox having four
 * @author Meeth
 */
public class FreshBox {

    Trays t1;// creates a reference for an object of type Tray i.e represents tray 1
    Trays t2;// creates a reference for an object of type Tray i.e represents tray 2
    Trays t3;// creates a reference for an object of type Tray i.e represents tray 3
    Trays t4;// creates a reference for an object of type Tray i.e represents tray 4

    /**
     * no argument FreshBox constructor initializes instances of class Trays
     */
    public FreshBox() {
        t1 = new Trays();
        t2 = new Trays();
        t3 = new Trays();
        t4 = new Trays();

    }

    /**
     * replaces the tray in a fresh box with user desired contents
     */
    public void substituteTray() {
        Scanner input = new Scanner(System.in);
        Scanner re = new Scanner(System.in);
        System.out.println("enter the tray number to be replaced");
        int traynumber = input.nextInt();
        System.out.println("replace with from the list below:\n 1. Banana \n 2. Apple \n 3. Cauliflower \n 4. Potato \n 5.Capsicum");
        String replacementitem = re.nextLine();
        if (replacementitem.equalsIgnoreCase("banana")
                || replacementitem.equalsIgnoreCase("apple")
                || replacementitem.equalsIgnoreCase("capsicum")
                || replacementitem.equalsIgnoreCase("potato")
                || replacementitem.equalsIgnoreCase("cauliflower")) {
            if (traynumber == 1) {
                t1.fv.setName(replacementitem);
            } else if (traynumber == 2) {
                t2.fv.setName(replacementitem);
            } else if (traynumber == 3) {
                t3.fv.setName(replacementitem);
            } else if (traynumber == 4) {
                t4.fv.setName(replacementitem);
            }
        } else {
            System.out.println("Wrong item entered");
        }
    }

    /**
     * It is a method to display contents of Fresh Box
     * @return a string representing contents of Fresh Box
     */
    @Override
    public String toString() {
        System.out.println("The contents of the FreshBox are :");
        System.out.println("Tray 1" + t1.fv.getName());
        System.out.println("Tray 2" + t2.fv.getName());
        System.out.println("Tray 3" + t3.fv.getName());
        System.out.println("Tray 4" + t4.fv.getName());

        return null;
    }

    /**
     * attaches recipe to the fresh box
     */
    public void recipe() {
        String[] list = new String[4];
        list[0] = t1.fv.getName();
        list[1] = t2.fv.getName();
        list[2] = t3.fv.getName();
        list[3] = t4.fv.getName();
        int count = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (list[i].equals(list[j])) {
                    if (count < 2) {
                        System.out.println("Here is a recipe for mashed " + list[j]);
                    }

                    count++;
                }
            }
        }

    }

}
