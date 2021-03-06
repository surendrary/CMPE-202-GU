import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @Green Techies 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(850, 650, 1); 
        setUp();
       
    }
    
    private void setUp()
    {
        GreenfootImage backgroundImage = new GreenfootImage("GameOver4.jpg");
        setBackground(backgroundImage);
        //GreenfootImage image = new GreenfootImage("GameOver.png");
        //setImage(image);
        CloseButton closebutton = new CloseButton();
        addObject(closebutton,getWidth()/2+410,(getHeight()-640));
        // redirects back to home page
        HomeButton hb = new HomeButton();
        addObject(hb,40,getHeight()-610);
    }
}
