import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Iepure extends Actor
{
    private GreenfootImage iepure;
    private GreenfootImage iepure2;
    private int score;
    private int spawnEgg;
    World currentWorld;
   
    public Iepure() {
        iepure=new GreenfootImage("iepure.png");
        //iepure.scale(90,90);
        iepure2=new GreenfootImage("iepure2.png");
       // iepure2.scale(90,90);
     
        setImage(iepure);
        spawnEgg=0;
        score=0;
    
    }

    
    public void act() 
    {
       collectEggs();
       checkKeyPress();
       currentWorld = getWorld();
       if(!(currentWorld instanceof Level3 ))
           addNewEgg();
    }    
    
    public void checkKeyPress()
    {
        int viteza=5;
        if((currentWorld instanceof Level5 ) && (currentWorld instanceof Level6 )) 
                viteza=6;
                
        if ( Greenfoot.isKeyDown("up") == true )
        {
           setLocation(getX(), getY() -viteza );
           if(getY()<=5 && !((currentWorld instanceof Level5 ) || (currentWorld instanceof Level6)))
               setLocation(getX(), getY() +595 );
        }
        
        if ( Greenfoot.isKeyDown("down") == true )
        {
            setLocation(getX(), getY() + viteza);
            if(getY()>=595 && !((currentWorld instanceof Level5 ) || (currentWorld instanceof Level6)))
               setLocation(getX(), getY() -595 );
        }
        
        if ( Greenfoot.isKeyDown("left") == true )
        {
            setImage(iepure2);
            setLocation(getX()-viteza, getY());
            if(getX()<=5 && !((currentWorld instanceof Level5 ) || (currentWorld instanceof Level6)))
               setLocation(getX()+790, getY() -viteza);
        }
        
        if ( Greenfoot.isKeyDown("right") == true )
        {
            setImage(iepure);
            setLocation(getX()+viteza, getY());
            if(getX()>=795 && !((currentWorld instanceof Level5 ) || (currentWorld instanceof Level6)))
               setLocation(getX()-790, getY() -viteza );
        }
    }

    public void increaseScore()
    {
        if (!getWorld().getObjects(Counter.class).isEmpty()) 
        {
            getWorld().getObjects(Counter.class).get(0).add(1);
            getWorld().getObjects(Counter.class).get(0).setPrefix("Score:");
        }
    }
     
    public void collectEggs()
    {
        Actor Ou1,Ou2;
        Ou1=getOneObjectAtOffset(15,15,Ou.class);
        Ou2=getOneObjectAtOffset(-15,-10,Ou.class);
        if ( Ou1!=null || Ou2!=null )
        {
            try{
                currentWorld.removeObject(Ou1);
                currentWorld.removeObject(Ou2);
            }catch (Exception e){Greenfoot.start();};
            Greenfoot.playSound("collect.wav");
            score++;
            spawnEgg++;
            increaseScore();

        }
    }
    
    public void addNewEgg()
    {
        if ( spawnEgg == 1 )
        {
            currentWorld.addObject( new Ou(), Greenfoot.getRandomNumber(760)+20, 30+Greenfoot.getRandomNumber(540));
            spawnEgg = 0;
        }
    }
    
  
}
