import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
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
       if(((Jupiter)getWorld()).turnoJg1){
        movimiento();
           enCombate(); 
        }
    }
    public void enCombate(){
        Random x = new Random();
        
            if(isTouching(GuerreroH.class)){
                int num = x.nextInt(100)+1;
         if(0<num&&num<=30){
            List <GuerreroH> gh = new ArrayList();
             gh = getWorld().getObjects(GuerreroH.class);
           for(GuerreroH p: gh){
            p.setEnergia(getEnergia()-10);
            if(p.getEnergia()==0)
            removeTouching(GuerreroH.class);
            }
           
        }
            }
        
          if(isTouching(MedicoH.class)){
              int num = x.nextInt(100)+1;
              if(0<num&&num<=50){
           List<MedicoH> gh = new ArrayList();
             gh = getWorld().getObjects(MedicoH.class);
           for(MedicoH p: gh){
            p.setEnergia(getEnergia()-10);
            if(p.getEnergia()==0){
            removeTouching(MedicoH.class);
            }
            
        }
            }      
        }
        
} 
public void curar(){
  if(isTouching(GuerreroP.class)){
      List<GuerreroP> gh = new ArrayList();
      gh = getWorld().getObjects(GuerreroP.class);
      for(GuerreroP p: gh){
         p.setEnergia(getEnergia()+20);
         setEnergia(getEnergia()-20);
        }
    }
}
   public void movimiento(){
      
       
       if(Greenfoot.isKeyDown("w")){
       int prueba=0;   
           if(Greenfoot.isKeyDown("up")){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
         if(Greenfoot.isKeyDown("down")){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
             if(Greenfoot.isKeyDown("right")){
          
              move(1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
            if(Greenfoot.isKeyDown("left")){
          
              move(-1);
              prueba++;
              if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
          
        }
        
    }
}



