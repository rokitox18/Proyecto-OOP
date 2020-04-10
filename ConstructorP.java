import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorP extends Proto
{
    /**
     * Act - do whatever the ConstructorP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  int energia;
    private boolean primerToque;
   public void cambiarToque(){
    if(primerToque == true)
    primerToque = false;
    else{
        primerToque=false;
    }
}
    public ConstructorP(){
      this.energia = 100;
       
    }
    public void setToque(boolean primer){
    this.primerToque= primer; 
    }
    public boolean getToque(){
    return this.primerToque;
    }
    public void act() 
    {   
        
        if(((Jupiter)getWorld()).turnoJg1){
       if(getToque()){
        enCombate();
    }
       chequear();
       }
    }
    public void chequear(){
     if(((Jupiter)getWorld()).turnoJg1){
         movimiento();
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
    }
        

    public void movimiento(){
      
       
       if(Greenfoot.isKeyDown("q")){
       int prueba=0;   
           if(Greenfoot.isKeyDown("up")){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              enCombate();
              
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
         if(Greenfoot.isKeyDown("down")){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              enCombate();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
             if(Greenfoot.isKeyDown("right")){
          
              move(1);
              prueba++;
              enCombate();
              if(prueba==1){
                 
            ((Jupiter)getWorld()).cambiarTurno1(); 
            }
            }
            if(Greenfoot.isKeyDown("left")){
          
              move(-1);
              prueba++;
              enCombate();
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
