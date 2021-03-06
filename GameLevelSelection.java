import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;

/**
 * This will be shown for choosing game level in both multi player and singke player.
 * In Multi plyaer , it will appread in this sequence Multiplayer-> Host Game-> Select Level
 * In Single Player, it will appread in this sequence SinglePlayer -> Select Level
 * 
 * @author Green Techies
 * @version 1.
 */
public class GameLevelSelection extends World
{
    String playerName = "";
    String level = "";
    boolean isMultiplayer;
    boolean isHost;
    String gameName ="";
 
    /**
     * Constructor for objects of class GameLevelSelection.
     * 
     */
    public GameLevelSelection(String playerName,boolean isMultiplayer, boolean isHost,String gameName)
    {    
       super(850, 650, 1);
       this.playerName = playerName; 
       this.isMultiplayer = isMultiplayer;
       this.isHost = isHost;
       this.gameName = gameName;
       setUpGameLevelSelection(); 
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void setUpGameLevelSelection()
    {
        GreenfootImage backgroundImage = new GreenfootImage("home_page_Background.jpg");
        setBackground(backgroundImage); 
        GreenfootImage game_Name = new GreenfootImage("difficulty_level.png");
        getBackground().drawImage(game_Name, backgroundImage.getWidth()/2 -160, 20);
       
        getBackground().setFont(new Font("", Font.BOLD | Font.ITALIC, 25));
        getBackground().drawString(this.playerName,5,30);
        
        Greenfoot.setSpeed(50);
        CloseButton closebutton = new CloseButton();
        addObject(closebutton,getWidth()/2+410,(getHeight()-640));
        
        EasyGameButton easygame=new EasyGameButton(this.playerName,this.gameName,this.isMultiplayer,this.isHost);
        addObject(easygame,backgroundImage.getWidth()/2+100,250);
        HardGameButton hardhame=new HardGameButton(this.playerName,this.gameName,this.isMultiplayer,this.isHost);
        addObject(hardhame,backgroundImage.getWidth()/2 +100,400);
        
        //rushin
        BackButton bb = new BackButton();
        addObject(bb,35,backgroundImage.getHeight()+275);       
    }
}
