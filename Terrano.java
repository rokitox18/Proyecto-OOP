import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terranos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Terrano extends Especie
{
    private int energia;
    private boolean turnoJg2 = false;
    /**
     * Act - do whatever the Terranos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(((Jupiter)getWorld()).turnoJg2){
        enCombate();
        ((Jupiter)getWorld()).cambiarTurno2();
         }    
     }
   public abstract void enCombate();
}
