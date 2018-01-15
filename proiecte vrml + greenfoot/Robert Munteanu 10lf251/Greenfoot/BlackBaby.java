import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BlackBaby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackBaby extends Actor
{
    private int score = 0;
    public int getScore()
    {
        return score;
    }
    
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
             setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
             setLocation(getX()+2, getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
             setLocation(getX(), getY()+2);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            turn(90);
            move(-2);
        }
        eat();
        getHit();
        finishGame();
    }    
    public void eat()
    {
        Actor hamburger;
        hamburger = getOneObjectAtOffset(0, 0, Hamburger.class);
        if(Greenfoot.isKeyDown("space"))
        {
            World world;
            world = getWorld();
            world.removeObject(hamburger);
        } 
    }
    public void getHit()
    {
        World world = getWorld();
        Actor car;
        car = getOneIntersectingObject(Car.class);
        if (car != null)
        {
            world.removeObjects((world.getObjects(null)));
            world.setBackground("game_over.jpg");
            Greenfoot.stop();
        }
    }
    public void finishGame()
    {
        World world = getWorld();
        if(score == 4)
        {
            world.removeObjects((world.getObjects(null)));
            world.setBackground("you_win.jpg");
            Greenfoot.stop();
        }
    }
}