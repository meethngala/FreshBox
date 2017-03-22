/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freshbox;
import java.util.*;
/**
 *Generates the content of the Fresh box
 * @author Meeth
 */
public class GenerateFreshBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        FreshBox box=  new FreshBox();// creates a reference to an object of type FreshBox
        box.toString();
        System.out.println("Do you want to substitue the contents of FreshBox: yes or no");
        String option= sc.nextLine();
        if (option.equalsIgnoreCase("yes"))
        {
            box.substituteTray();
            box.recipe();
            box.toString();
        }// end of if
        else if(option.equalsIgnoreCase("no"))
        {
            box.recipe();
            box.toString();
        }
      // end of else if
    }
  // end of main method
}
