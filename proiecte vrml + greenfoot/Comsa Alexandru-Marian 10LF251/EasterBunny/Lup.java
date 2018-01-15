import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lup extends Actor
{
    private GreenfootImage lup;
    private GreenfootImage lup2;
    World currentWorld;
    
    public Lup() {
        lup=new GreenfootImage("lup.png");
        lup.scale(150,90);
        lup2=new GreenfootImage("lup2.png");
        lup2.scale(150,90);
        setImage(lup);
    
    } 
    
   
 
    public void act()
    {
        lupMove();
        eatTheBunny();
        currentWorld = getWorld();
    }  
    private int  ydirection = -5, xdirection = 5;
    public void lupMove()
    { 
        int viteza=5;
        
        if(currentWorld instanceof Level2 )
            viteza=2;
        else if((currentWorld instanceof Level3 ) || (currentWorld instanceof Level4 )) 
                viteza=4;
        
        if (getX() < 10)
            xdirection=viteza;
        if (getX() > getWorld().getWidth()-10) 
            xdirection=-viteza;
        if (getY() < 10)
            ydirection=viteza;
        if (getY() > getWorld().getHeight()-10) 
            ydirection=-viteza;
        if(xdirection>0)
            setImage(lup);
        else
           setImage(lup2);
        setLocation(getX()+xdirection,getY()+ydirection);
    }
    
    

    public void turnAtEdge()
    {
        if ( getX()>=795 || getY()>=595 || getX()<=5 || getY()<=5)
        {
            turn(17);
        }
    }
    
    public void eatTheBunny()
    {
        Actor Iepure1,Iepure2;
        Iepure1=getOneObjectAtOffset(55,10,Iepure.class);
        Iepure2=getOneObjectAtOffset(-5,-10,Iepure.class);
        if ( Iepure1!=null || Iepure2!=null )
        {
            World gazon;
            gazon=getWorld();
            gazon.removeObject(Iepure1);
            gazon.removeObject(Iepure2);
            //eat(Ou.class);
            Greenfoot.playSound("bite.wav");
            //Greenfoot.playSound("wolf.wav");
            //increaseScore();
            //wormsEaten++;
            //spawnCounter++;
        }
    }
}
