import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ou extends Actor
{
    private GreenfootImage ou;
    private GreenfootImage[] oua={new GreenfootImage("ou1.png"),
                                  new GreenfootImage("ou2.png"),
                                  new GreenfootImage("ou3.png"),
                                  new GreenfootImage("ou4.png"),
                                  new GreenfootImage("ou5.png"),
                                  new GreenfootImage("ou6.png"),
                                  new GreenfootImage("ou7.png"),
                                             
    };
    public Ou() {
       ou=oua[Greenfoot.getRandomNumber(7)];
       //ou.scale(35,50);
       setImage(ou);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
