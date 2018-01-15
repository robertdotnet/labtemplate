import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        loopCar(this);
    }    
    
    public Car()
    {
    }
    
    public int getx()
    {
        return this.getX();
    }
    
    public int gety()
    {
        return this.getY();
    }
    
    private int counter = 0;
    public int spawn()
    {
        if (counter == 40)
        {
            counter = 0;
        }
        else
        {
            counter ++;
        }
        return counter;
    }
    
    public void loopCar(Car thisCar)
    {
        thisCar = this;
        if(thisCar.getx() == 1180)
        {
            thisCar.setLocation(0, thisCar.gety());
        }
    }
}
