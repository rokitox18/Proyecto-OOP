import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MedicoP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoP extends Proto
{
    /**
     * Act - do whatever the MedicoP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MedicoP(){
     setEnergia(120);   
    }
    public void act() 
    {
       enCombate();
    } 
    public void enCombate(){
        Random x = new Random();
        
            if(isTouching(GuerreroH.class)){
                int num = x.nextInt(100)+1;
         if(0<num&&num<=30){
            removeTouching(GuerreroH.class);
            }
        }
          if(isTouching(MedicoH.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=50){
            removeTouching(MedicoH.class);
            }      
        }
        
}    
}
