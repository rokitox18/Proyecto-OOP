import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Guerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class GuerreroH extends Terrano
{
    /**
     * Act - do whatever the Guerrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GuerreroH(){
        setEnergia(100);
    }
    public void act() 
    {
        enCombate();
    } 
        public void enCombate(){
        Random x = new Random();
        
            if(isTouching(GuerreroP.class)){
                int num = x.nextInt(100)+1;
         if(0<num&&num<=50){
            removeTouching(GuerreroP.class);
            }
        }
          if(isTouching(MedicoP.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=70){
            removeTouching(MedicoP.class);
            }      
        }
        
}
}
