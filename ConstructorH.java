import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorH extends Terrano
{
    /**
     * Act - do whatever the ConstructorH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       private  int energia;
    private boolean    primerToque;
    public void cambiarToque(){
    if(primerToque == true)
    primerToque = false;
    else{
        primerToque=false;
    }
}
    public ConstructorH(){
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
        
        if(((Jupiter)getWorld()).turnoJg2){
        if(getToque()){
        enCombate();
    }
        chequear();
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
   public void movimiento(){
      
       
       if(Greenfoot.isKeyDown("a")){
       int prueba=0;   
           if(Greenfoot.isKeyDown("up")){
          int y = getY();
              setLocation(getX(),y-1);
              prueba++;
              if(prueba==1){
                  enCombate();
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
         if(Greenfoot.isKeyDown("down")){
          int y = getY();
              setLocation(getX(),y+1);
              prueba++;
              enCombate();
              if(prueba==1){
                  
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
             if(Greenfoot.isKeyDown("right")){
          
              move(1);
              prueba++;
              enCombate();
              if(prueba==1){
                 
            ((Jupiter)getWorld()).cambiarTurno2(); 
            }
            }
            if(Greenfoot.isKeyDown("left")){
          
              move(-1);
              prueba++;
              enCombate();
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
    public  int getEnergia(){
        return this.energia;
}
 public void setEnergia(int energia){
        this.energia = energia;
} 
}
