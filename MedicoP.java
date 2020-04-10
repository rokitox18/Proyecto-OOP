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
    public MedicoP(){
     this.energia= 120;  
    }
    public void act() 
    {
       if(((Jupiter)getWorld()).turnoJg1){
        movimiento();
           enCombate(); 
        }
    }
    public void enCombate(){
        if(isTouching(GuerreroH.class)){
        Actor op = this.getOneIntersectingObject(GuerreroH.class);
        if((op !=null)|| getToque()){ 
            int prueba = 0; 
        
                
             GuerreroH m = new GuerreroH();
            m =(GuerreroH) op;
           m.setEnergia( m.getEnergia() -10);

            if(m.getEnergia() < 0)
            removeTouching(GuerreroH.class);
            cambiarToque();
            prueba++;
            if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1();
            }
        }
       
        }
          if(isTouching(MedicoH.class)){
              Actor op = this.getOneIntersectingObject(MedicoH.class);
        if((op !=null)|| getToque()){ 
            int prueba = 0; 
        
                
           MedicoH m = new MedicoH();
            m =(MedicoH) op;
           m.setEnergia( m.getEnergia() -10);

            if(m.getEnergia() < 0)
            removeTouching(GuerreroH.class);
            cambiarToque();
            prueba++;
            if(prueba==1){
            ((Jupiter)getWorld()).cambiarTurno1();
            }
        }
    }
    if(isTouching(ConstructorH.class)){
              Actor op = this.getOneIntersectingObject(ConstructorH.class);
        if((op !=null)|| getToque()){ 
            int prueba = 0; 
        
                
           ConstructorH m = new ConstructorH();
            m =(ConstructorH) op;
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
    if(isTouching(GuerreroP.class)){
        int prueba =0;
         Actor op = this.getOneIntersectingObject(GuerreroP.class);
        if((op !=null)|| getToque()){   
        
              
             GuerreroP m = new GuerreroP();
            m =(GuerreroP) op;
            if(m.getEnergia()<160)
           m.setEnergia( m.getEnergia() +20);
           setEnergia(getEnergia()-20);
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
                
            ((Jupiter)getWorld()).cambiarTurno1(); 
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
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
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
                 
            ((Jupiter)getWorld()).cambiarTurno1(); 
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
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
          
        
        
    } public boolean chequeoTocar(){
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
