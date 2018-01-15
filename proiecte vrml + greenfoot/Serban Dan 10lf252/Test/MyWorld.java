import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    
    long startTime = System.currentTimeMillis();
    public GreenfootImage[] drum=new GreenfootImage[4];
    int[] random_pos={75,225,375,525};
    Thread th;// = new Thread(new Car_thread());
    int aux;
    int ultim=0;
    Random_masini rnd;
    int scorul=0;
    int scormax=0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(new Backgr(),500,300);
        addObject(new m1(),100,300);
        
        
        rnd=new Random_masini();
       
        addObject(new Counter(),20,10);
        read();
        addObject(new Scormax(scormax),900,20);
        
        
   
    
   
    }
    
    int roll(int a)
    { int init=10;
      if(a<5)
         a=5;
      int ok=Greenfoot.getRandomNumber(init-a);
      if(ok==0)
        return 1;
      return 0;
      
      
        
    };
    
    
    public void act()
    {   int dublu;
        int aha=50*(scorul/20);
        if(aha>300)
            aha=0;
        int aux=800-aha;
         long currentTime = System.currentTimeMillis();
         int durationMillis = (int)(currentTime - startTime);
        int durationSecs = durationMillis;// 1000;
        if(durationSecs>aux)
        {
            
            spawn();
            dublu=roll(scorul/20);
            if(dublu==1)
               { spawn();
                 if(roll(scorul/10)==1)
                 spawn();
                }
            scorul++;
            
            startTime = System.currentTimeMillis();
        } 
        if(scorul>scormax)
         { scormax=scorul;
              this.getObjects(Scormax.class).get(0).add(scormax);}
            
       // write();
        
    }
    
    public void spawn()
    {    
         int i=0; 
         i=rnd.calcul();
         // i=Greenfoot.getRandomNumber(4);
         // while(i==ultim)
            // i=Greenfoot.getRandomNumber(4);
        // ultim=i;
        addObject(new m2(scorul),1000,random_pos[i]);
               
    }
    
    public void read()
    {
       
            try {
                BufferedReader br = new BufferedReader(new FileReader("Scormax.txt"));
                scormax = br.read();
                System.out.println(scormax);
                
            } 
            catch(IOException ex)
        {
            ex.printStackTrace();
        }

    }
    
    public int getScorul()
    {
        return scorul;
    }
    
    public void write()
    {
        try{
        PrintWriter writer = new PrintWriter("Scormax.txt");
        
        writer.println(scormax);
        writer.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        
        
    }

}