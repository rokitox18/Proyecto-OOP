import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Proto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Proto extends Especie
{
    public void objAleatorio(){
        
     List lp = getWorld().getObjects(Proto.class);
       int num = Greenfoot.getRandomNumber(6);
      Proto c= (Proto) lp.get(num);
      if(c.getClass()==ConstructorP.class){
          ConstructorP o = new ConstructorP();
         o =  (ConstructorP) c;
         o.act();
    }if(c.getClass()==GuerreroP.class){
          GuerreroP o = new GuerreroP();
         o =  (GuerreroP) c;
         o.act();
    }
    if(c.getClass()==MedicoP.class){
          MedicoP o = new MedicoP();
         o =  (MedicoP) c;
         o.act();
    }
}
}
