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
        
        super(11, 6, 105);
        GuerreroP grP = new GuerreroP();
        addObject(grP,0,0);
        GuerreroP grP2 = new GuerreroP();
        addObject(grP2,0,1);
        GuerreroP grP3 = new GuerreroP();
        addObject(grP3,0,2);
        MedicoP md = new MedicoP();
        addObject(md,1,0);
        MedicoP md2 = new MedicoP();
        addObject(md2,2,0);
        GuerreroH grH = new GuerreroH();
        addObject(grH,10,3);
        GuerreroH grH2 = new GuerreroH();
        addObject(grH2,10,2);
        GuerreroH grH3 = new GuerreroH();
        addObject(grH3,10,1);
        MedicoH mh = new MedicoH();
        addObject(mh,10,4);
        MedicoH mh2 = new MedicoH();
        addObject(mh2,10,5);
        ConstructorP cp = new ConstructorP();
        addObject(cp,3,0);
         ConstructorP cp2 = new ConstructorP();
        addObject(cp2,3,1);
        ConstructorH ch = new ConstructorH();
        addObject(ch,8,5);
        ConstructorH ch2 = new ConstructorH();
        addObject(ch2,9,5);
        Obst ob = new Obst();
        addObject(ob,8,2);
         Obst ob2 = new Obst();
        addObject(ob2,4,2);
         Obst ob3 = new Obst();
        addObject(ob3,8,4);
        Obst ob4 = new Obst();
        addObject(ob4,4,4);
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
