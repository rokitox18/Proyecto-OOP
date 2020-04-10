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
     this.energia = 120;
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
   if(isTouching(ConstructorP.class)){
              Actor op = this.getOneIntersectingObject(ConstructorP.class);
        if((op !=null)|| getToque()){ 
            int prueba = 0; 
        
                
           ConstructorP m = new ConstructorP();
            m =(ConstructorP) op;
           m.setEnergia( m.getEnergia() -15);

            if(m.getEnergia() < 0)
            removeTouching(ConstructorH.class);
            cambiarToque();
            prueba++;
            if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1();
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
            if(m.getEnergia()<160){  
           m.setEnergia( m.getEnergia() +20);
           setEnergia(getEnergia()-20);
        }
            cambiarToque();
            if(prueba==1){  
             ((Jupiter)getWorld()).cambiarTurno2();
        }
  
}
}
}

 public void movimiento(){
        int z = Greenfoot.getRandomNumber(3)+1;
       
       
       int prueba=0;   
           if(z==1){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              
              if(chequeoTocar()){
                setLocation(getX(),y);
                }
                enCombate();
              if(prueba==1){
                
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
         if(z==2){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              if(chequeoTocar()){
                setLocation(getX(),y);
                }
              enCombate();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
             if(z==3){
              int x = getX();   
              move(1);
              prueba++;
              if(chequeoTocar()){
                setLocation(x,getY());
                }
              enCombate();
              if(prueba==1){
                 
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
            if(z==4){
                int x = getX();
              move(-1);
              prueba++;
              if(chequeoTocar()){
                setLocation(x,getY());
                }
              enCombate();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
          
        
        
    }
    public void chequear(){
     if(((Jupiter)getWorld()).turnoJg2){
         movimiento();
        }
    }
     public boolean chequeoTocar(){
        Actor noTocar = this.getOneIntersectingObject(Obst.class);
        
        if (noTocar != null){
         return true;   
            
        }
        else{
        return false;
        }
    }
    public  int getEnergia(){
        return this.energia;
}
 public void setEnergia(int energia){
        this.energia = energia;
}
}
