import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level6 extends World
{
    private boolean gameStarted = false;

    public Level6()
    {   
        super(800, 600, 1);
        addObject( new Ou(), Greenfoot.getRandomNumber(760)+20, 30+Greenfoot.getRandomNumber(540));
        addObject( new Iepure(), 400, 300);
        addObject( new Counter(), 50, 15);
        addObject( new Lup(),100, 100);  
        addObject( new Lup(),700, 500); 
        addObject( new Lup(),600, 200); 
    }

     public void act()
    {
        while (!gameStarted)
        {
            if (Greenfoot.isKeyDown("space"))
            {
                gameStarted = true;
            }
        }
    }
}
