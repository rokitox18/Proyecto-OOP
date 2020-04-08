import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoH extends Terrano
{
    /**
     * Act - do whatever the Medico wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public MedicoH(){
     setEnergia(120);   
    }
    public void act() 
    {
        if(((Jupiter)getWorld()).turnoJg2){
        movimiento();
           enCombate();
           curar();
        }
    }
     public void enCombate(){
        Random x = new Random();
        
            if(isTouching(GuerreroP.class)){
                int num = x.nextInt(100)+1;
         if(0<num&&num<=30){
            List <GuerreroP> gh = new ArrayList();
             gh = getWorld().getObjects(GuerreroP.class);
           for(GuerreroP p: gh){
            p.setEnergia(getEnergia()-10);
            if(p.getEnergia()==0)
            removeTouching(GuerreroP.class);
            }
           
        }
            }
        
          if(isTouching(MedicoP.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=50){
           List<MedicoP> gh = new ArrayList();
             gh = getWorld().getObjects(MedicoP.class);
           for(MedicoP p: gh){
            p.setEnergia(getEnergia()-10);
            if(p.getEnergia()==0){
            removeTouching(MedicoP.class);
            }
            
        
        }
    }
    }
}
public void curar(){
  if(isTouching(GuerreroH.class)){
      List<GuerreroH> gh = new ArrayList();
      gh = getWorld().getObjects(GuerreroH.class);
      for(GuerreroH p: gh){
         MedicoH m = new MedicoH();
          p.setEnergia(getEnergia()+20);
       m.setEnergia(getEnergia()-20);
       setEnergia(m.getEnergia());
        }
    }
}

  public void movimiento(){
      
       
       if(Greenfoot.isKeyDown("s")){
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
}
