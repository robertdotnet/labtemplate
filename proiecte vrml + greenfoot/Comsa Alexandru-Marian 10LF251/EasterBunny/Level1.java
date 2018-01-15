import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level1 extends World
{
    public Level1()
    {    
        super(800, 600, 1);
        for(int i=0;i<30;i++)
        {
            addObject( new Ou(), Greenfoot.getRandomNumber(760)+20, 30+Greenfoot.getRandomNumber(540));
        }
        addObject( new Iepure(), 400, 300);
        addObject( new Counter(), 50, 15);
    }
}
