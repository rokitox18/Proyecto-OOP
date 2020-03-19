import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Planeta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(14, 10, 50);
        GuerreroP oso = new GuerreroP();
        addObject(oso, 1, 1);
        GuerreroH kangaroo = new GuerreroH();
        addObject(kangaroo, 1, 1);
    }
}
