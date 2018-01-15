import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Backgr extends Actor
{
      
     public GreenfootImage[] drum=new GreenfootImage[4];
     long startTime;
     int i;
   public Backgr()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        startTime = System.currentTimeMillis();
        try{
        drum[0]=new GreenfootImage("Drum0.jpg");
        drum[0].scale(1000,600);
        drum[1]=new GreenfootImage("Drum1.jpg");
        drum[1].scale(1000,600);
        drum[2]=new GreenfootImage("Drum2.jpg");
        drum[2].scale(1000,600);
        
        
       }
       catch(Exception e){}   
    }
    
    public void clear()
    {
         drum=new GreenfootImage[0];
    }
    
    
    public void act()
    {
        
        
        if(i>=3)
            i=0;
        setImage(drum[i]);
        i++;
        try {
            Thread.currentThread().sleep(50);
            }
       catch(InterruptedException ie) {
           ie.printStackTrace(); //only if you want the exception to be printet on the terminal;
        }
          if(i>=3)
          {i=0;}
             
    }
    
}
