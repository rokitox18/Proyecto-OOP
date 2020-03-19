import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Especie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Especie extends Actor
{
    /**
     * Act - do whatever the Especie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int energia;
    public void setEnergia(int energia){
     this.energia = energia;   
    }
    public void act() 
    {
        // Add your action code here.
    }
    public int getEnergia(){
     return this.energia;   
    }
}
