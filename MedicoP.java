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
                int num =   Greenfoot.getRandomNumber(100);
         if(0<num&&num<=50){
           int j = getEnergia();
            j-=10;    
            setEnergia(j);
            if(getEnergia() < 0)
            removeTouching(GuerreroP.class);
            
           
        }
            }
        
          if(isTouching(MedicoH.class)){
              int num =  Greenfoot.getRandomNumber(100);
              if(0<num&&num<=50){
           List<MedicoH> gh = new ArrayList();
             gh = getWorld().getObjects(MedicoH.class);
           for(MedicoH p: gh){
            setEnergia(getEnergia()-10);
            if(getEnergia() < 0){
            removeTouching(MedicoH.class);
            }
            
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
      
       
       if(Greenfoot.isKeyDown("w")){
       int prueba=0;   
           if(Greenfoot.isKeyDown("up")){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              enCombate();
              curar();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
         if(Greenfoot.isKeyDown("down")){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              enCombate();
              curar();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
             if(Greenfoot.isKeyDown("right")){
          
              move(1);
              prueba++;
              enCombate();
              curar();
              if(prueba==1){
                 
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
            if(Greenfoot.isKeyDown("left")){
          
              move(-1);
              prueba++;
              enCombate();
              curar();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
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
