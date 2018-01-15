import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class m2 extends Actor
{
    int sc=40;
     private GreenfootImage img;
     public  m2(int a)
    {   sc=a;
        img=new GreenfootImage("car03.png");
        img.scale(200,100);
        setImage(img);
        try{
        int aux=getWorld().getObjects(MyWorld.class).get(0).getScorul();
        sc=-40-(aux/10);
        }
        catch(NullPointerException e){}
        
    }
    
    public void act() 
    {
        setLocation(getX()-(40+2*(sc/20)),getY());
        if(getX()<=0)
         {
          
             increaseScore();
            getWorld().removeObject(this);
         
            
         }
            
    }    
    
    public void increaseScore() {
    if (!getWorld().getObjects(Counter.class).isEmpty()) {
        getWorld().getObjects(Counter.class).get(0).add(1);}
    }
}
