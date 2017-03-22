/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freshbox;

import java.util.Random;

/**
 *Represents Fruits and Vegetables
 * @author Meeth
 * @version 1
 */
public class FruitsAndVegetables 
{

    /**
     * Attribute of the class FruitsAndVegetables
     */
    public String name;
    

    /**
     * no argument constructor of Fruits and Vegetables
     */
    public FruitsAndVegetables( )
{
   
}

    /**
     *Generates random numbers within the specified range
     * @param min lower limit of range
     * @param max upper limit of range
     * @return random number
     */
    public int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * set the name of fruits or vegetables
     * @param s name of fruits or vegetables
     */
    public void setName(String s)
{
    name=s;
}

    /**
     * no argument method to set name of fruits or vegetables
     * @return name of fruits or vegetables
     */
    public String setName()
{
    int x= getRandomNumber(1,5);
    switch(x)
    {
        case 1:
            name= "Banana";
            break;
        case 2:
            name="Apple";
            break;
        case 3:
            name= "Cauliflower";
            break;
        case 4:
            name= "Potato";
        case 5:
            name="Capsicum";
            break;
    }
    return name;
}

    /**
     * get the name fruits or vegetables
     * @return name of fruits or vegetables
     */
    public String getName()
{
    return name;
}
}
