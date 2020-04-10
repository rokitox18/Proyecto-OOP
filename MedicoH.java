import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.*;
/**
 * Write a description of class MedicoH here.
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
    
   private int energia;
   private boolean    primerToque;
    public void cambiarToque(){
    if(primerToque == true)
    primerToque = false;
    else{
        primerToque=false;
    }
}
public boolean getToque(){
    return this.primerToque;
    }
    public MedicoH(){
     this.energia = energia;
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
        if(isTouching(GuerreroP.class)){
        int prueba =0;
         Actor op = this.getOneIntersectingObject(GuerreroP.class);
        if((op !=null)|| getToque()){   
        
              
             GuerreroP m = new GuerreroP();
            m =(GuerreroP) op;
           m.setEnergia( m.getEnergia() -10);
           
            if(m.getEnergia() < 0)
            removeTouching(GuerreroP.class);
            cambiarToque();
            if(prueba==1){  
             ((Jupiter)getWorld()).cambiarTurno2();
        }
    }
        
    
    }
          if(isTouching(MedicoP.class)){
              int prueba =0;
         Actor op = this.getOneIntersectingObject(MedicoP.class);
        if((op !=null)|| getToque()){   
        
              
             MedicoP m = new MedicoP();
            m =(MedicoP) op;
           m.setEnergia( m.getEnergia() -10);
           
            if(m.getEnergia() < 0)
            removeTouching(MedicoP.class);
            cambiarToque();
            if(prueba==1){  
             ((Jupiter)getWorld()).cambiarTurno2();
        }
    }
        
    }
   
  }
public void curar(){
    if(isTouching(GuerreroH.class)){
        int prueba =0;
         Actor op = this.getOneIntersectingObject(GuerreroH.class);
        if((op !=null)|| getToque()){   
        
              
             GuerreroH m = new GuerreroH();
            m =(GuerreroH) op;
            if(m.getEnergia()<160);
           m.setEnergia( m.getEnergia() +20);
           setEnergia(getEnergia()-20);
            if(m.getEnergia() < 0)
            removeTouching(GuerreroP.class);
            cambiarToque();
            if(prueba==1){  
             ((Jupiter)getWorld()).cambiarTurno2();
        }
  
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
    public  int getEnergia(){
        return this.energia;
}
 public void setEnergia(int energia){
        this.energia = energia;
}
}
