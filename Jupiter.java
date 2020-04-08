import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jupiter extends World
{
    public boolean turnoJg1 = true;
    public boolean turnoJg2 = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Jupiter()
    {    
        
        super(15, 10, 50);
        GuerreroP grP = new GuerreroP();
        addObject(grP,0,0);
        MedicoP md = new MedicoP();
        addObject(md,1,0);
        GuerreroH grH = new GuerreroH();
        addObject(grH,5,4);
        MedicoH mh = new MedicoH();
        addObject(mh,1,4);
    }
   public void cambiarTurno1(){
       if(turnoJg1){
        turnoJg1 = false;
        turnoJg2 = true;
        }     
    }
    public void cambiarTurno2(){
        if(turnoJg2){
        turnoJg1 = true;
        turnoJg2 = false;
        }     
    }
}
