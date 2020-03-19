import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class GuerreroP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroP extends Proto
{
    /**
     * Act - do whatever the GuerreroP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GuerreroP(){
        setEnergia(100);
    }
    public void act() 
    {
        enCombate();
    }
    
     public void enCombate(){
        Random x = new Random();
        GuerreroH gh = new GuerreroH();
            if(isTouching(GuerreroH.class)){
                int num = x.nextInt(100)+1;
         if(0<num&&num<=50){
         removeTouching(GuerreroH.class);
            }
        }
          if(isTouching(MedicoH.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=70){
            removeTouching(MedicoP.class);
            }      
        }
        
}
}
