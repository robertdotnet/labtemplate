import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scor extends Actor
{
    /**
     * Act - do whatever the scor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    int count=0;
    
    
    
    public void act() 
    {
       //setImage(new GreenfootImage("Scor: " + String.valueOf(count), 24)); 
     //  setImage(new GreenfootImage("Score : " + count, 24 ,Color.BLACK, Color.BLACK));
      String prefix="Scor";
      
       GreenfootImage text = new GreenfootImage(prefix + count, 22, Color.BLACK, Color.WHITE);
      
    } 
    
    public void inc(int a)
    {
        count=a;
    }
    
}
