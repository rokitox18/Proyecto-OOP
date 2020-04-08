import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
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
        if(((Jupiter)getWorld()).turnoJg2){
        enCombate();
        chequear();
    }
    } 
        public void enCombate(){
        Random x = new Random();
        
            if(isTouching(GuerreroP.class)){
                int num = x.nextInt(100)+1;
                if(0<num&&num<=50){
                    List<GuerreroP> gh = new ArrayList();
             gh = getWorld().getObjects(GuerreroP.class);
             for(GuerreroP p: gh){
                 p.setEnergia(getEnergia()-10);
            if(p.getEnergia()==0){
            removeTouching(MedicoH.class);
            }
            
            
            }
        }
    }
          if(isTouching(MedicoP.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=70){
            List<MedicoP> gh = new ArrayList();
             gh = getWorld().getObjects(MedicoP.class);
             for(MedicoP p: gh){
                 p.setEnergia(getEnergia()-10);
                 if(p.getEnergia()==0){
            removeTouching(MedicoH.class);
            }
            }      
        }
        
    }
  }
   public void movimiento(){
      
       
       if(Greenfoot.isKeyDown("a")){
       int prueba=0;   
           if(Greenfoot.isKeyDown("up")){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
         if(Greenfoot.isKeyDown("down")){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
             if(Greenfoot.isKeyDown("right")){
          
              move(1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
            if(Greenfoot.isKeyDown("left")){
          
              move(-1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
          
        }
        
    }
    public void chequear(){
     if(((Jupiter)getWorld()).turnoJg2){
         movimiento();
        }
    }
}

