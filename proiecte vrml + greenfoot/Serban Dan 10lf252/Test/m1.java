import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class m1 extends Actor
{   
    public GreenfootImage img,img1,img2;
    long startTime = System.currentTimeMillis()%100;
    int devmod;
  
    public  m1()
    {
        img=new GreenfootImage("ambulance.png");
        img1=new GreenfootImage("ambulance2.png");
        img2=new GreenfootImage("ambulance3.png");
        img.scale(200,120);
        img1.scale(230,221);
        img2.scale(230,221);
        devmod=1;
        setImage(img);
        
    }
    
    public void act() 
    {   int aux=0;
       if(!(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("down")))
         setRotation(0);
       if(Greenfoot.isKeyDown("up"))
       {
           setRotation(-28);
           //turn(-8);
          // setImage(img2);
           setLocation(getX(),getY()-45);
           
           colisiune1();
           aux=1;
       }
       else
       {setImage(img);
        
        }
       if(Greenfoot.isKeyDown("down"))
       {    //setImage(img1);
           setRotation(28);
          // turn(8);
            setLocation(getX(),getY()+45);
           
            colisiune1();
            aux=2;
       }
       else
       {
         
        }
       
       if(Greenfoot.isKeyDown("left"))
       {    
            setLocation(getX()-45,getY());
       }
       if(Greenfoot.isKeyDown("right"))
       {
            setLocation(getX()+45,getY());
       }
       colisiune_switch(aux);
      
      
        
    }    
    
    public void colisiune_switch(int i)
    {   if(devmod==0){
        if(i==0)
            colisiune1();
        else
            if(i==1)
            {
               
            colisiune1();
            }
            else
            {
            colisiune1();
           
            }
        }
    }
    
    
    public void colisiune1()
    {
        
       Actor a1=getOneObjectAtOffset(120,30,m2.class);
        Actor a2=getOneObjectAtOffset(120,-30,m2.class);
        Actor a3=getOneObjectAtOffset(-120,30,m2.class);
        Actor a4=getOneObjectAtOffset(-120,-30,m2.class);
        Actor a=getOneIntersectingObject(m2.class);
        if ( a1!=null || a2!=null ||a3!=null || a4!=null)// ||a!=null )
        //if ( a!=null )
        {
          //  Greenfoot.stop();
          
          getWorld().getObjects(Scormax.class).get(0).write();
          getWorld().getObjects(Backgr.class).get(0).clear();
            Greenfoot.stop();
         //  Greenfoot.setWorld(new MyWorld());
            World g;
            g=getWorld();
            
           // gazon.removeObject(Ou1);
          //  gazon.removeObject(Ou2);
            //eat(Ou.class);
          //  Greenfoot.playSound("collect.wav");
           // score++;
           // increaseScore();
            //wormsEaten++;
            //spawnCounter++;
        }
    }
    
     public void colisiune_up()
    {
        
       Actor a1=getOneObjectAtOffset(100,20,m2.class);
        Actor a4=getOneObjectAtOffset(-100,-20,m2.class);
        Actor a=getOneIntersectingObject(m2.class);
        if ( a1!=null ||  a4!=null)// ||a!=null )
        //if ( a!=null )
        {
          //  Greenfoot.stop();
          
          getWorld().getObjects(Scormax.class).get(0).write();
          getWorld().getObjects(Backgr.class).get(0).clear();
            Greenfoot.stop();
         //  Greenfoot.setWorld(new MyWorld());
            World g;
            g=getWorld();
            
           // gazon.removeObject(Ou1);
          //  gazon.removeObject(Ou2);
            //eat(Ou.class);
          //  Greenfoot.playSound("collect.wav");
           // score++;
           // increaseScore();
            //wormsEaten++;
            //spawnCounter++;
        }
    }
    
    
     public void colisiune_down()
    {
        
       
        Actor a2=getOneObjectAtOffset(100,-20,m2.class);
        Actor a3=getOneObjectAtOffset(-100,20,m2.class);
        Actor a=getOneIntersectingObject(m2.class);
        if (  a2!=null ||a3!=null )// ||a!=null )
        //if ( a!=null )
        {

          
          getWorld().getObjects(Scormax.class).get(0).write();
          getWorld().getObjects(Backgr.class).get(0).clear();
            Greenfoot.stop();
     
            World g;
            g=getWorld();
         
        }
    }
    
    public void colisiune2()
    {
        Actor a=getOneIntersectingObject(m2.class);
        if (a!=null )
        
        {
            getWorld().getObjects(Scormax.class).get(0).write();
            getWorld().getObjects(Backgr.class).get(0).clear();
           Greenfoot.stop();
            //Greenfoot.setWorld(new MyWorld());
        }
        
    }
}
