import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Proto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class  Proto extends Especie
{
    private int energia;
   
    /**
     * Act - do whatever the Proto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(((Jupiter)getWorld()).turnoJg1){
        enCombate();
        ((Jupiter)getWorld()).cambiarTurno1();
    }
}  
    public abstract void enCombate();
}
