import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Counter class that allows you to display a numerical value on screen.
 * 
 * The Counter is an actor, so you will need to create it, and then add it to
 * the world in Greenfoot.  If you keep a reference to the Counter then you
 * can adjust its value.  Here's an example of a world class that
 * displays a counter with the number of act cycles that have occurred:
 * 
 * <pre>
 * class CountingWorld
 * {
 *     private Counter actCounter;
 *     
 *     public CountingWorld()
 *     {
 *         super(600, 400, 1);
 *         actCounter = new Counter("Act Cycles: ");
 *         addObject(actCounter, 100, 100);
 *     }
 *     
 *     public void act()
 *     {
 *         actCounter.setValue(actCounter.getValue() + 1);
 *     }
 * }
 * </pre>
 * 
 * @author Neil Brown and Michael Kölling 
 * @version 1.0
 */
public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    World myWorld;
    private String prefix="Score:";
    
    public Counter()
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public Counter(String prefix)
    {
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
        myWorld = getWorld();
        //nextLevel();
    }

    /**
     * Add a new score to the current counter value.  This will animate
     * the counter over consecutive frames until it reaches the new value.
     */
    public void add(int score)
    {
        target += score;
    }

    /**
     * Return the current counter value.
     */
    public int getValue()
    {
        return target;
    }

    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /**
     * Sets a text prefix that should be displayed before
     * the counter value (e.g. "Score: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    public void nextLevel()
    {
        myWorld.removeObjects(myWorld.getObjects(null));
        Greenfoot.playSound("won.wav");
        myWorld.setBackground("space.jpg");
        Greenfoot.delay(5);
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        if(value == 20 && myWorld instanceof Level1) 
        {
            nextLevel();
            Greenfoot.setWorld(new Level2());
        }
        else if(value == 20 && myWorld instanceof Level2)
        {
            nextLevel();
            Greenfoot.setWorld(new Level3());
        }
        else if(value == 20 && myWorld instanceof Level3)
        {
            nextLevel();
            Greenfoot.setWorld(new Level4());
        }
        else if(value == 20 && myWorld instanceof Level4)
        {
            nextLevel();
            Greenfoot.setWorld(new Level5());
        }  
        else if(value == 20 && myWorld instanceof Level5)
        {
            nextLevel();
            Greenfoot.setWorld(new Level6());
        }
        else if(value == 20 && myWorld instanceof Level6)
            {
                myWorld.removeObjects(myWorld.getObjects(null));
                myWorld.setBackground("game_over.jpg");
                Greenfoot.stop();
            }
            
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
