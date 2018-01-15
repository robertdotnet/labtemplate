import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

public class Scormax extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
    private int aux0=0;
    private int scorulmax=0;
    public Scormax()
    {
        this(new String());
    }
    
    public Scormax(int a)
    {  
        this(new String()+"Scor maxim ");
        add(a);
        aux0=a;
        
        
    }

    
    public Scormax(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
  
    public void act() 
    {
       updateImage();
        
    }

    public void add(int score)
    {
         if(score>scorulmax)
        scorulmax=score;
    }

    public int getValue()
    {
        return scorulmax;
    }

  
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
  
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

  
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + scorulmax, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }

    public void write()
    {
        try{
        PrintWriter writer = new PrintWriter("Scormax.txt");
        
        writer.println(scorulmax);
        writer.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        
        
    }
}