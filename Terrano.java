import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Terrano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Terrano extends Especie
{
   
    private boolean turnoJg2 = false;
    /**
     * Act - do whatever the Terranos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void act() 
    {
        if(((Jupiter)getWorld()).turnoJg2){
        enCombate();
        ((Jupiter)getWorld()).cambiarTurno2();
         }    
     }
   public abstract void enCombate();
   public void objAleatorio(){
        
     List lp = getWorld().getObjects(Terrano.class);
       int num = Greenfoot.getRandomNumber(6);
      Terrano c= (Terrano) lp.get(num);
      if(c.getClass()==ConstructorH.class){
          ConstructorH o = new ConstructorH();
         o =  (ConstructorH) c;
         o.act();
    }if(c.getClass()==GuerreroH.class){
          GuerreroH o = new GuerreroH();
         o =  (GuerreroH) c;
         o.act();
    }
    if(c.getClass()==MedicoH.class){
          MedicoH o = new MedicoH();
         o =  (MedicoH) c;
         o.act();
    }
}

}
