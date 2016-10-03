import greenfoot.*;
import java.util.Random;

/**
 * This is the central class for implenting the Game
 * 
 * @author Green Techies
 * @version 1.0
 */
public class GameEngine extends Actor 
{
    // instance variables - replace the example below with your own
    private int computerGuess;
    public String playerName = "";

    /**
     * Constructor for objects of class GameEngine
     */
    public GameEngine(String playerName)
    {
      this.playerName = playerName;
      Random random = new Random();
      computerGuess = random.nextInt(100)+2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act()
    {
        //
    }
    
    
}
