/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freshbox;



/**
 *represents Trays having fruits and vegetables
 * @author Meeth
 * @version 1
 */
public class Trays
{
    FruitsAndVegetables fv;// creates a reference for object of type FruitsAndVegetables

    /**
     * no argument constructor of Trays
     */
    public Trays()
    {
        fv = new FruitsAndVegetables();
        fv.setName();
       
     }
 
}
