import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Thread.*;

public class MyWorld extends World
{   
    public MyWorld()
    {    
        super(1200, 675, 1);
        addBaby();
        for (int i = 0; i<4 ; i++)
            addHamburger();
        setBackground(new GreenfootImage("Background.jpg"));
        addCar1();
        addCar2();
        addCar3();
        addCar4();
    }
    public void addBaby()
    {
        addObject(new BlackBaby(), 1100, 630);
    }
    
    public void addHamburger()
    {
        addObject(new Hamburger(), Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(550));
    }
    
    public Car addCar1()
    {
        Car car = new Car();
        addObject(car, 0, 228);
        return car;
    }
    public Car addCar2()
    {
        Car car = new Car();
        addObject(car, 5, 374);
        return car;
    }
    public Car addCar3()
    {
        Car car = new Car();
        addObject(car, 550, 532);
        return car;
    }
    public Car addCar4()
    {
        Car car = new Car();
        addObject(car, 400, 162);
        return car;
    }
    private int counter = 0; 
    public int count()
    {
        if (counter == 4)
        {
            counter = 0;     
        }
        else
        {
            counter ++;
        }
        return counter;
    }
    
    
}
